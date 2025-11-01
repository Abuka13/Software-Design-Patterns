package strategy;

import heroes.Hero;

public class RangedAttack implements AttackStrategy {
    @Override
    public void attack(Hero attacker, Hero target) {
        int staminaCost = attacker.getRangedStaminaCost();
        int arrowCost = attacker.getArrowCost();
        if (attacker.getArrows() < arrowCost) {
            attacker.notifyObservers(attacker.getName() + " has no arrows left and switches to MeleeAttack.");
            attacker.setAttackStrategy(new MeleeAttack());
            return;
        }
        if (attacker.getStamina() < staminaCost) {
            attacker.notifyObservers(attacker.getName() + " is too tired for ranged attack and recovers.");
            attacker.recoverStamina(8);
            return;
        }
        double acc = attacker.getRangedAccuracy();
        attacker.useArrows(arrowCost);
        attacker.useStamina(staminaCost);
        if (attacker.rnd.nextDouble() <= acc) {
            int dmg = attacker.getRangedDamage();
            target.takeDamage(dmg);
            attacker.notifyObservers(attacker.getName() + " shoots " + target.getName() + " for " + dmg + " damage. Arrows left: " + attacker.getArrows());
        } else {
            attacker.notifyObservers(attacker.getName() + " misses a ranged shot. Arrows left: " + attacker.getArrows());
        }
        if (attacker.getArrows() <= 0) {
            attacker.notifyObservers(attacker.getName() + " ran out of arrows and will switch to MeleeAttack.");
            attacker.setAttackStrategy(new MeleeAttack());
        }
    }
}

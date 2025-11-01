package strategy;

import heroes.Hero;

public class MeleeAttack implements AttackStrategy {
    @Override
    public void attack(Hero attacker, Hero target) {
        int cost = attacker.getMeleeStaminaCost();
        if (attacker.getStamina() < cost) {
            if (attacker.getMana() >= attacker.getMagicManaCost()) {
                attacker.notifyObservers(attacker.getName() + " is too tired for melee attack and switches to MagicAttack.");
                attacker.setAttackStrategy(new MagicAttack());
                attacker.attack(target);
                return;
            } else if (attacker.getArrows() > 0 && attacker.getStamina() >= attacker.getRangedStaminaCost()) {
                attacker.notifyObservers(attacker.getName() + " is too tired for melee attack and switches to RangedAttack.");
                attacker.setAttackStrategy(new RangedAttack());
                attacker.attack(target);
                return;
            } else {
                attacker.notifyObservers(attacker.getName() + " is too tired and has no resources left. Resting.");
                attacker.recoverStamina(10);
                return;
            }
        }

        double acc = attacker.getMeleeAccuracy();
        if (attacker.rnd.nextDouble() <= acc) {
            int dmg = attacker.getMeleeDamage();
            attacker.useStamina(cost);
            target.takeDamage(dmg);
            attacker.notifyObservers(attacker.getName() + " strikes " + target.getName() + " for " + dmg + " damage.");
        } else {
            attacker.useStamina(cost);
            attacker.notifyObservers(attacker.getName() + " misses melee attack.");
        }
    }
}

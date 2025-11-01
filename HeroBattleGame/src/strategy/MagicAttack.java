package strategy;

import heroes.Hero;

public class MagicAttack implements AttackStrategy {
    @Override
    public void attack(Hero attacker, Hero target) {
        int manaCost = attacker.getMagicManaCost();
        if (attacker.getMana() < manaCost) {
            if (attacker.getArrows() > 0) {
                attacker.notifyObservers(attacker.getName() + " has insufficient mana and switches to RangedAttack.");
                attacker.setAttackStrategy(new RangedAttack());
            } else {
                attacker.notifyObservers(attacker.getName() + " has insufficient mana and switches to MeleeAttack.");
                attacker.setAttackStrategy(new MeleeAttack());
            }
            return;
        }
        double acc = attacker.getMagicAccuracy();
        attacker.useMana(manaCost);
        if (attacker.rnd.nextDouble() <= acc) {
            int dmg = attacker.getMagicDamage();
            target.takeDamage(dmg);
            attacker.notifyObservers(attacker.getName() + " casts a spell on " + target.getName() + " for " + dmg + " damage. Mana left: " + attacker.getMana());
        } else {
            attacker.notifyObservers(attacker.getName() + " fails to cast a spell. Mana left: " + attacker.getMana());
        }
        if (attacker.getMana() < attacker.getMagicManaCost()) {
            if (attacker.getArrows() > 0) {
                attacker.notifyObservers(attacker.getName() + " is low on mana and switches to RangedAttack.");
                attacker.setAttackStrategy(new RangedAttack());
            } else {
                attacker.notifyObservers(attacker.getName() + " is low on mana and switches to MeleeAttack.");
                attacker.setAttackStrategy(new MeleeAttack());
            }
        }
    }
}

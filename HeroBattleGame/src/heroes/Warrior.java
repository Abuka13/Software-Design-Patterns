package heroes;

import strategy.MeleeAttack;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
        this.health = 105;
        this.stamina = 80;
        this.mana = 20;
        this.arrows = 5;
        this.attackStrategy = new MeleeAttack();
    }

    @Override
    public int getMeleeDamage() {
        return 21;
    }
    @Override
    public double getMeleeAccuracy() {
        return 0.85;
    }
    @Override
    public int getRangedDamage() {
        return 15;
    }
    @Override
    public double getRangedAccuracy() {
        return 0.75;
    }
    @Override
    public int getMagicDamage() {
        return 27;
    }
    @Override
    public double getMagicAccuracy() {
        return 0.70;
    }
    @Override
    public int getMeleeStaminaCost() {
        return 30;
    }
    @Override
    public int getRangedStaminaCost() {
        return 15;
    }
    @Override
    public int getMagicManaCost() {
        return 10;
    }
    @Override
    public int getArrowCost() {
        return 1;
    }
}

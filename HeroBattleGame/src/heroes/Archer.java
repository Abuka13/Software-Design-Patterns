package heroes;

import strategy.RangedAttack;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
        this.health = 93;
        this.stamina = 70;
        this.mana = 40;
        this.arrows = 10;
        this.attackStrategy = new RangedAttack();
    }

    @Override
    public int getMeleeDamage() {
        return 15;
    }
    @Override
    public double getMeleeAccuracy() {
        return 0.80;
    }
    @Override
    public int getRangedDamage() {
        return 25;
    }
    @Override
    public double getRangedAccuracy() {
        return 0.85;
    }
    @Override
    public int getMagicDamage() {
        return 30;
    }
    @Override
    public double getMagicAccuracy() {
        return 0.75;
    }
    @Override
    public int getMeleeStaminaCost() {
        return 8;
    }
    @Override
    public int getRangedStaminaCost() {
        return 20;
    }
    @Override
    public int getMagicManaCost() {
        return 20;
    }
    @Override
    public int getArrowCost() {
        return 1;
    }
}

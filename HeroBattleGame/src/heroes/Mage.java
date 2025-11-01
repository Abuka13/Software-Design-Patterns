package heroes;

import strategy.MagicAttack;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
        this.health = 80;
        this.stamina = 60;
        this.mana = 100;
        this.arrows = 7;
        this.attackStrategy = new MagicAttack();
    }

    @Override
    public int getMeleeDamage() {
        return 12;
    }
    @Override
    public double getMeleeAccuracy() {
        return 0.70;
    }
    @Override
    public int getRangedDamage() {
        return 18;
    }
    @Override
    public double getRangedAccuracy() {
        return 0.80;
    }
    @Override
    public int getMagicDamage() {
        return 40;
    }
    @Override
    public double getMagicAccuracy() {
        return 0.85;
    }
    @Override
    public int getMeleeStaminaCost() {
        return 15;
    }
    @Override
    public int getRangedStaminaCost() {
        return 15;
    }
    @Override
    public int getMagicManaCost() {
        return 50;
    }
    @Override
    public int getArrowCost() {
        return 1;
    }
}

package heroes;

import observer.Observer;
import observer.Subject;
import strategy.AttackStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Hero implements Subject {
    protected String name;
    protected int health;
    protected int stamina;
    protected int mana;
    protected int arrows;
    protected AttackStrategy attackStrategy;
    private final List<Observer> observers = new ArrayList<>();
    public final Random rnd = new Random();

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getStamina() {
        return stamina;
    }
    public int getMana() {
        return mana;
    }
    public int getArrows() {
        return arrows;
    }
    public String getAttackStrategyName() {
        return attackStrategy.getClass().getSimpleName();
    }

    public abstract int getMeleeDamage();
    public abstract double getMeleeAccuracy();
    public abstract int getRangedDamage();
    public abstract double getRangedAccuracy();
    public abstract int getMagicDamage();
    public abstract double getMagicAccuracy();
    public abstract int getMeleeStaminaCost();
    public abstract int getRangedStaminaCost();
    public abstract int getMagicManaCost();
    public abstract int getArrowCost();

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
        notifyObservers(name + " changed attack strategy to " + attackStrategy.getClass().getSimpleName());
    }

    public void attack(Hero target) {
         if (health <= 0) {
            notifyObservers(name + " cannot attack because defeated.");
            return;
        }

        if (stamina < 15 && mana >= getMagicManaCost()) {
            if (!(attackStrategy instanceof strategy.MagicAttack)) {
                setAttackStrategy(new strategy.MagicAttack());
            }
        } else if (mana < getMagicManaCost() && arrows > 0 && stamina >= getRangedStaminaCost()) {
            if (!(attackStrategy instanceof strategy.RangedAttack)) {
                setAttackStrategy(new strategy.RangedAttack());
            }
        } else if ((stamina < 10 && arrows <= 0 && mana < getMagicManaCost())
                || (mana <= 0 && arrows <= 0)) {
            if (!(attackStrategy instanceof strategy.MeleeAttack)) {
                setAttackStrategy(new strategy.MeleeAttack());
            }
        }

        if (attackStrategy == null) {
            notifyObservers(name + " has no attack strategy.");
            return;
        }

        notifyObservers(name + " prepares to attack with " + getAttackStrategyName());
        attackStrategy.attack(this, target);


        if (target.getHealth() <= 0) {
            notifyObservers(target.getName() + " has been defeated!");
        }
    }


    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        notifyObservers(name + " lost " + damage + " HP (HP left: " + health + ")");
    }

    public void useStamina(int s) {
        stamina -= s;
        if (stamina < 0) stamina = 0;
    }

    public void recoverStamina(int s) {
        stamina += s;
        notifyObservers(name + " recovers " + s + " stamina (stamina: " + stamina + ")");
    }

    public void useMana(int m) {
        mana -= m;
        if (mana < 0) mana = 0;
    }

    public void useArrows(int a) {
        arrows -= a;
        if (arrows < 0) arrows = 0;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer o : new ArrayList<>(observers)) o.update(event);
    }

    public boolean isAlive() {
        return health > 0;
    }
}

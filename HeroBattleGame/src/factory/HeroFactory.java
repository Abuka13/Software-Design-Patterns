package factory;

import heroes.Archer;
import heroes.Hero;
import heroes.Mage;
import heroes.Warrior;

public class HeroFactory {
    public static Hero createHero(String type, String name) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior(name);
            case "archer":
                return new Archer(name);
            case "mage":
                return new Mage(name);
            default:
                throw new IllegalArgumentException("Unknown hero type: " + type);
        }
    }
}

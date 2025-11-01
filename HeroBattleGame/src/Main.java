import facade.BattleFacade;
import factory.HeroFactory;
import heroes.Hero;

public class Main {
    public static void main(String[] args) {
        Hero thor = HeroFactory.createHero("mage", "Merlin");
        Hero merlin = HeroFactory.createHero("Archer", "Thor");
        BattleFacade facade = new BattleFacade();
        facade.startBattle(thor, merlin);
    }
}

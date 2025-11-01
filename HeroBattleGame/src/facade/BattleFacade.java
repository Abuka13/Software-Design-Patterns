package facade;

import heroes.Hero;
import observer.BattleLogger;
import observer.Observer;

public class BattleFacade {
    private final Observer logger = new BattleLogger();

    public void startBattle(Hero a, Hero b) {
        a.registerObserver(logger);
        b.registerObserver(logger);

        System.out.println("Battle started between " + a.getName() + " and " + b.getName() + "!");
        int round = 1;
        Hero attacker = a;
        Hero defender = b;
        while (a.isAlive() && b.isAlive()) {
            System.out.println("\n--- Round " + round + " ---");
            attacker.attack(defender);
            printStatus(a, b);
            if (!defender.isAlive()) break;
            Hero temp = attacker;
            attacker = defender;
            defender = temp;
            round++;
            if (round > 1000) break;
        }
        System.out.println("\nBattle finished!");
        printStatus(a, b);
        if (a.isAlive() && !b.isAlive()) System.out.println(a.getName() + " wins!");
        else if (!a.isAlive() && b.isAlive()) System.out.println(b.getName() + " wins!");
        else System.out.println("Draw!");
    }

    private void printStatus(Hero a, Hero b) {
        System.out.println(a.getName() + " HP: " + a.getHealth() + " | Stamina: " + a.getStamina() + " | Mana: " + a.getMana() + " | Arrows: " + a.getArrows());
        System.out.println(b.getName() + " HP: " + b.getHealth() + " | Stamina: " + b.getStamina() + " | Mana: " + b.getMana() + " | Arrows: " + b.getArrows());
    }
}

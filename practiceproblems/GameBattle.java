package week7.practiceproblems;

public class GameBattle {
    boolean isCritical;

    public void attack(int damage) {
        System.out.println("Basic attack, damage dealt: " + damage);
    }

    public void attack(int damage, String weapon) {
        System.out.println("Attacking with " + weapon + " for " + damage + " points!");
    }

    public void attack(int damage, String weapon, boolean isCritical) {
        if (isCritical) {
            System.out.println("CRITICAL HIT! " + weapon + " deals " + (damage * 2) + " points!");
        } else {
            attack(damage, weapon);
        }
    }

    public void attack(int damage, String[] teammates) {
        System.out.println("Team attack with " + teammates.length + " members, total damage: " + (damage * teammates.length));
        for (String member : teammates) {
            System.out.println(member + " joins the attack!");
        }
    }

    public static void main(String[] args) {
        GameBattle gameBattle = new GameBattle();

        gameBattle.attack(50); // Basic attack
        gameBattle.attack(75, "Sword"); // Weapon attack
        gameBattle.attack(60, "Bow", true); // Critical attack
        gameBattle.attack(40, new String[]{"Alice", "Bob"}); // Team attack
    }
}

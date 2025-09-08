package week4.lab;
import java.util.*;

abstract class MagicalStructure {
    String structureName;
    int magicPower;
    String location;
    boolean isActive;

    MagicalStructure() {
        this("Unknown", 0, "Unknown", true);
    }

    MagicalStructure(String structureName) {
        this(structureName, 50, "Unknown", true);
    }

    MagicalStructure(String structureName, int magicPower, String location, boolean isActive) {
        this.structureName = structureName;
        this.magicPower = magicPower;
        this.location = location;
        this.isActive = isActive;
    }

    abstract void castMagicSpell();
}

class WizardTower extends MagicalStructure {
    int spellCapacity;
    String[] knownSpells;

    WizardTower() {
        this("Wizard Tower", 100, "Hill", true, 5, new String[]{"Fireball"});
    }

    WizardTower(String[] spells) {
        this("Wizard Tower", 120, "Hill", true, spells.length, spells);
    }

    WizardTower(String name, int power, String loc, boolean active, int cap, String[] spells) {
        super(name, power, loc, active);
        this.spellCapacity = cap;
        this.knownSpells = spells;
    }

    void castMagicSpell() {
        System.out.println(structureName + " casts " + (knownSpells.length > 0 ? knownSpells[0] : "Mystic Aura"));
    }
}

class EnchantedCastle extends MagicalStructure {
    int defenseRating;
    boolean hasDrawbridge;

    EnchantedCastle() {
        this("Enchanted Castle", 80, "Valley", true, 50, true);
    }

    EnchantedCastle(String name, int defense, boolean drawbridge) {
        this(name, 100, "Valley", true, defense, drawbridge);
    }

    EnchantedCastle(String name, int power, String loc, boolean active, int defense, boolean drawbridge) {
        super(name, power, loc, active);
        this.defenseRating = defense;
        this.hasDrawbridge = drawbridge;
    }

    void castMagicSpell() {
        System.out.println(structureName + " raises protective barriers!");
    }
}

class MysticLibrary extends MagicalStructure {
    int bookCount;
    String ancientLanguage;

    MysticLibrary() {
        this("Mystic Library", 60, "Forest", true, 100, "Latin");
    }

    MysticLibrary(String lang, int books) {
        this("Mystic Library", 70, "Forest", true, books, lang);
    }

    MysticLibrary(String name, int power, String loc, boolean active, int books, String lang) {
        super(name, power, loc, active);
        this.bookCount = books;
        this.ancientLanguage = lang;
    }

    void castMagicSpell() {
        System.out.println(structureName + " reveals forbidden knowledge in " + ancientLanguage);
    }
}

class DragonLair extends MagicalStructure {
    String dragonType;
    int treasureValue;

    DragonLair() {
        this("Dragon Lair", 150, "Mountain", true, "Fire Dragon", 1000);
    }

    DragonLair(String type, int treasure) {
        this("Dragon Lair", 180, "Mountain", true, type, treasure);
    }

    DragonLair(String name, int power, String loc, boolean active, String type, int treasure) {
        super(name, power, loc, active);
        this.dragonType = type;
        this.treasureValue = treasure;
    }

    void castMagicSpell() {
        System.out.println(structureName + " unleashes " + dragonType + " fury!");
    }
}

class KingdomManager {
    static boolean canStructuresInteract(MagicalStructure s1, MagicalStructure s2) {
        if (s1 instanceof WizardTower && s2 instanceof MysticLibrary) return true;
        if (s1 instanceof EnchantedCastle && s2 instanceof DragonLair) return true;
        if (s1 instanceof WizardTower && s2 instanceof WizardTower) return true;
        return false;
    }

    static String performMagicBattle(MagicalStructure attacker, MagicalStructure defender) {
        if (attacker.magicPower > defender.magicPower) return attacker.structureName + " wins!";
        else if (attacker.magicPower < defender.magicPower) return defender.structureName + " wins!";
        else return "It's a tie!";
    }

    static int calculateKingdomMagicPower(MagicalStructure[] structures) {
        int total = 0;
        for (MagicalStructure s : structures) total += s.magicPower;
        return total;
    }

    static void categorizeStructures(MagicalStructure[] structures) {
        for (MagicalStructure s : structures) {
            if (s instanceof WizardTower) System.out.println(s.structureName + " -> Wizard Tower");
            else if (s instanceof EnchantedCastle) System.out.println(s.structureName + " -> Castle");
            else if (s instanceof MysticLibrary) System.out.println(s.structureName + " -> Library");
            else if (s instanceof DragonLair) System.out.println(s.structureName + " -> Dragon Lair");
        }
    }

    static void determineSpecialization(MagicalStructure[] structures) {
        int magic = 0, defense = 0;
        for (MagicalStructure s : structures) {
            if (s instanceof WizardTower || s instanceof MysticLibrary) magic++;
            if (s instanceof EnchantedCastle || s instanceof DragonLair) defense++;
        }
        if (magic > defense) System.out.println("Kingdom Specialization: Magic-focused");
        else if (defense > magic) System.out.println("Kingdom Specialization: Defense-focused");
        else System.out.println("Kingdom Specialization: Balanced");
    }
}

public class w4lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MagicalStructure> structures = new ArrayList<>();

        System.out.print("Enter number of structures: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Choose type (1=Tower, 2=Castle, 3=Library, 4=Lair): ");
            int type = sc.nextInt();
            sc.nextLine();
            switch (type) {
                case 1: structures.add(new WizardTower()); break;
                case 2: structures.add(new EnchantedCastle()); break;
                case 3: structures.add(new MysticLibrary()); break;
                case 4: structures.add(new DragonLair()); break;
                default: System.out.println("Invalid choice"); i--; break;
            }
        }

        System.out.println("Structures in Kingdom:");
        KingdomManager.categorizeStructures(structures.toArray(new MagicalStructure[0]));

        System.out.println("Total Magic Power: " + KingdomManager.calculateKingdomMagicPower(structures.toArray(new MagicalStructure[0])));
        KingdomManager.determineSpecialization(structures.toArray(new MagicalStructure[0]));

        if (structures.size() >= 2) {
            System.out.println("Battle Result: " + KingdomManager.performMagicBattle(structures.get(0), structures.get(1)));
        }

        sc.close();
    }
}


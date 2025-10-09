package week7.labproblems;

abstract class GameCharacter {
    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public abstract void attack();
}

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attack() {
        System.out.println(name + " swings a mighty sword! High defense shields them.");
    }
}

class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attack() {
        System.out.println(name + " casts a powerful spell! Mana drains with each strike.");
    }
}

class Archer extends GameCharacter {
    public Archer(String name) {
        super(name);
    }
    @Override
    public void attack() {
        System.out.println(name + " shoots a precise arrow! Long-range damage inflicted.");
    }
}

public class BattleSystem {
    public static void main(String[] args) {
        GameCharacter[] army = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Legolas"),
                new Warrior("Achilles"),
                new Mage("Gandalf")
        };

        for (GameCharacter character : army) {
            character.attack(); // dynamic method dispatch
        }
    }
}


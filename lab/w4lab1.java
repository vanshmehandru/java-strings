package week4.lab;
import java.util.*;

class VirtualPet {
    final String petId;
    String petName;
    String species;
    int age;
    int happiness;
    int health;
    int stageIndex;
    static final String[] EVOLUTION_STAGES = {"Egg", "Baby", "Child", "Teen", "Adult", "Elder", "Ghost"};
    static int totalPetsCreated = 0;

    VirtualPet() {
        this("Unknown", randomSpecies(), 0, 50, 50, 0);
    }

    VirtualPet(String petName) {
        this(petName, randomSpecies(), 0, 60, 60, 1);
    }

    VirtualPet(String petName, String species) {
        this(petName, species, 0, 70, 70, 2);
    }

    VirtualPet(String petName, String species, int age, int happiness, int health, int stageIndex) {
        this.petId = generatePetId();
        this.petName = petName;
        this.species = species;
        this.age = age;
        this.happiness = happiness;
        this.health = health;
        this.stageIndex = stageIndex;
        totalPetsCreated++;
    }

    static String randomSpecies() {
        String[] sp = {"Dragon", "Cat", "Dog", "Phoenix", "Rabbit"};
        return sp[new Random().nextInt(sp.length)];
    }

    static String generatePetId() {
        return UUID.randomUUID().toString();
    }

    void feedPet() {
        if (!isGhost()) {
            health += 10;
            happiness += 5;
        }
    }

    void playWithPet() {
        if (!isGhost()) {
            happiness += 10;
            health -= 2;
        }
    }

    void healPet() {
        if (!isGhost()) {
            health += 15;
        }
    }

    void simulateDay() {
        if (!isGhost()) {
            age++;
            happiness -= new Random().nextInt(5);
            health -= new Random().nextInt(5);
            evolvePet();
            if (health <= 0) {
                stageIndex = 6;
                species = "Ghost";
                health = 0;
            }
        }
    }

    void evolvePet() {
        if (!isGhost()) {
            if (age > 1 && age <= 3) stageIndex = 1;
            else if (age > 3 && age <= 6) stageIndex = 2;
            else if (age > 6 && age <= 10) stageIndex = 3;
            else if (age > 10 && age <= 15) stageIndex = 4;
            else if (age > 15) stageIndex = 5;
        }
    }

    boolean isGhost() {
        return stageIndex == 6;
    }

    String getPetStatus() {
        return EVOLUTION_STAGES[stageIndex];
    }

    void displayPet() {
        System.out.println("ID: " + petId);
        System.out.println("Name: " + petName);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
        System.out.println("Happiness: " + happiness);
        System.out.println("Health: " + health);
        System.out.println("Stage: " + getPetStatus());
        System.out.println("------------------");
    }
}

public class w4lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<VirtualPet> pets = new ArrayList<>();

        System.out.print("Enter number of pets to create: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter pet name: ");
            String name = sc.nextLine();
            System.out.print("Enter species: ");
            String species = sc.nextLine();
            pets.add(new VirtualPet(name, species));
        }

        System.out.print("Enter days to simulate: ");
        int days = sc.nextInt();

        for (int d = 1; d <= days; d++) {
            System.out.println("Day " + d);
            for (VirtualPet pet : pets) {
                pet.simulateDay();
                pet.displayPet();
            }
        }

        System.out.println("Total Pets Created: " + VirtualPet.totalPetsCreated);
        sc.close();
    }
}

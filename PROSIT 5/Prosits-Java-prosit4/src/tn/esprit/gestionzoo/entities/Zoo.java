package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String location;
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo(String name, String location) {
        this.name = name;
        this.location = location;
        this.aquaticAnimals = new Aquatic[10]; // Tableau de 10 animaux aquatiques
        this.aquaticCount = 0;
    }

    // Ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
            System.out.println(aquatic.getName() + " has been added to the aquatic animals.");
        } else {
            System.out.println("Cannot add more aquatic animals. The zoo is full.");
        }
    }

    // Afficher les animaux aquatiques qui nagent
    public void displaySwimmingAquatics() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }

    // Trouver la profondeur maximale pour les pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    // Afficher le nombre de dauphins et de pingouins
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

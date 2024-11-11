package tn.esprit.gestionzoo.entities;

// Importation de l'interface Omnivore et de l'énumération Food
public class Terrestrial extends Animal implements Omnivore<Food> {
    private int legCount;

    public Terrestrial(String family, String name, int age, boolean isMammal, int legCount) {
        super(family, name, age, isMammal);
        this.legCount = legCount;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", legCount=" + legCount;
    }

    @Override
    public void eatPlantAndMeet(Food food) {

    }

    // Redéfinition de la méthode eatMeat de l'interface Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    // Redéfinition de la méthode eatPlant de l'interface Herbivore
    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plants.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    // Redéfinition de la méthode eatPlantAndMeat de l'interface Omnivore
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both plants and meat.");
        } else {
            System.out.println(getName() + " cannot eat this food combination.");
        }
    }
}

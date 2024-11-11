package tn.esprit.gestionzoo.entities;

// Importation de l'interface Carnivore et de l'énumération Food
public abstract class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Méthode abstraite à redéfinir dans les classes filles
    public abstract void swim();

    // Redéfinition de la méthode eatMeat de l'interface Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return getAge() == aquatic.getAge() &&
                getName().equals(aquatic.getName()) &&
                habitat.equals(aquatic.getHabitat());
    }
}

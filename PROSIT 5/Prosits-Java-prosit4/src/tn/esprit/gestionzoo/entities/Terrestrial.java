package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int numberOfLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int numberOfLegs) {
        super(family, name, age, isMammal);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Terrestrial [numberOfLegs=" + numberOfLegs + "]";
    }
}

package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimSpeed = swimSpeed;
    }

    public float getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(float swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimSpeed=" + swimSpeed;
    }

    @Override
    public void eatPlantAndMeet(Food food) {

    }
}

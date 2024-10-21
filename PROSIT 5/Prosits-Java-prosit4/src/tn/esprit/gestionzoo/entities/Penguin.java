package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float wingSpan;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float wingSpan) {
        super(family, name, age, isMammal, habitat);
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Penguin [wingSpan=" + wingSpan + "]";
    }
}

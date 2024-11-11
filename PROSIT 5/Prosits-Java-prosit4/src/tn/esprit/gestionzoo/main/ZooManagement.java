package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        // Création du zoo
        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");

        // Création des animaux aquatiques
        Aquatic shark = new Aquatic("Fish", "Shark", 5, false, "Ocean") {
            @Override
            public void eatPlantAndMeet(Food food) {

            }

            @Override
            public void swim() {
                System.out.println("This aquatic animal is swimming.");
            }
        };
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 7, true, "Sea", 35.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Icebergs", 15.0f);

        // Ajout des animaux aquatiques dans le zoo
        myZoo.addAquaticAnimal(shark);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        // Affichage des animaux qui nagent
        myZoo.displaySwimmingAquatics();

        // Affichage de la profondeur maximale pour les pingouins
        System.out.println("Max Penguin Depth: " + myZoo.maxPenguinSwimmingDepth());

        // Affichage du nombre de dauphins et pingouins
        myZoo.displayNumberOfAquaticsByType();
    }
}

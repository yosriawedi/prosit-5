package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        // Création d'animaux
        Animal lion = createAnimal("Cats", "Simba", 8, true);
        Animal dog = createAnimal("Canine", "Snoopy", 2, true);
        Animal dog2 = createAnimal("Canine", "lll", 2, true);

        // Création d'animaux aquatiques et terrestres
        Aquatic aquaticAnimal = new Aquatic("Fish", "Shark", 5, false, "Ocean");
        Terrestrial terrestrialAnimal = new Terrestrial("Mammal", "Elephant", 12, true, 4);
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 7, true, "Sea", 35.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Icebergs", 15.0f);

        // Afficher les objets créés pour vérifier leur création
        displayAnimals(aquaticAnimal, terrestrialAnimal, dolphin, penguin);

        // Création d'instances de Zoo
        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

        // Ajouter des animaux au zoo
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        // Afficher les animaux du zoo
        myZoo.displayAnimals();

        // Rechercher un animal
        searchAnimalInZoo(myZoo, dog, dog2);

        // Afficher le zoo
        System.out.println(myZoo);

        // Ajouter plus d'animaux
        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();

        // Changer le nom du zoo et comparer les zoos
        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);
    }

    // Méthode pour créer un animal
    private static Animal createAnimal(String family, String name, int age, boolean isMammal) {
        Animal animal = new Animal();
        animal.setFamily(family);
        animal.setName(name);
        animal.setAge(age);
        animal.setMammal(isMammal);
        return animal;
    }

    // Méthode pour afficher les animaux
    private static void displayAnimals(Aquatic aquaticAnimal, Terrestrial terrestrialAnimal, Dolphin dolphin, Penguin penguin) {
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();
    }


    // Méthode pour rechercher un animal dans le zoo
    private static void searchAnimalInZoo(Zoo myZoo, Animal dog, Animal dog2) {
        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.searchAnimal(dog2));
    }
}

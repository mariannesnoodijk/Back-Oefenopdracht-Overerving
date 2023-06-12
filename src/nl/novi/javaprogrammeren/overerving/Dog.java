package nl.novi.javaprogrammeren.overerving;

public class Dog extends DomesticAnimals {
    public Dog(String name, String gender, String ownerName, String favoriteFood, String species) {
        super(name, gender, ownerName, favoriteFood, species);
    }

    @Override
    public void makesSound() {
        System.out.println("Woef");
    }
}

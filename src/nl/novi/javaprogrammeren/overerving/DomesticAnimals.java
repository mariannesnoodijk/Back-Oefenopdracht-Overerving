package nl.novi.javaprogrammeren.overerving;

public class DomesticAnimals extends Animal {

    String ownerName;
    String favoriteFood;
    String species;

    public DomesticAnimals(String name, String gender, String ownerName, String favoriteFood, String species) {
        super(name, gender);
        this.ownerName = ownerName;
        this.favoriteFood = favoriteFood;
        this.species = species;
    }
}

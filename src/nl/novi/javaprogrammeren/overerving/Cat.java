package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticAnimals {

    boolean outdoorCat; // standaard false.

    public Cat(String name, String gender, String ownerName, String favoriteFood, String species, boolean outdoorCat) {
        super(name, gender, ownerName, favoriteFood, species);
        this.outdoorCat = outdoorCat;
    }

    @Override
    public void makesSound() {
        System.out.println("Miauw");
    }
}

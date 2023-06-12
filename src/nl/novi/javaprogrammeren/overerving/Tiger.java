package nl.novi.javaprogrammeren.overerving;

public class Tiger extends WildAnimals {

    int amountOfStripes;

    public Tiger(String name, String gender, String cageName, String lastFedOnWeekday, String countryOfOrigin, int amountOfStripes) {
        super(name, gender, cageName, lastFedOnWeekday, countryOfOrigin);
        this.amountOfStripes = amountOfStripes;
    }

    @Override
    public void makesSound() {
        System.out.println(this.name + " makes sound: Roar!");
    }
}

package nl.novi.javaprogrammeren.overerving;

public class Lion extends WildAnimals {

    int numberOfChildren;

    public Lion(String name, String gender, String cageName, String lastFedOnWeekday, String countryOfOrigin, int numberOfChildren) {
        super(name, gender, cageName, lastFedOnWeekday, countryOfOrigin);
        this.numberOfChildren = numberOfChildren;
    }

    @Override
    public void makesSound() {
        System.out.println(this.name + " sounds like: RROOOAAARR");
    }
}

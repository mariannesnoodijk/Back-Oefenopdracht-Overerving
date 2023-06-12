package nl.novi.javaprogrammeren.overerving;

public class Wolf extends WildAnimals {

    String packName;

    public Wolf(String name, String gender, String cageName, String lastFedOnWeekday, String countryOfOrigin, String packName) {
        super(name, gender, cageName, lastFedOnWeekday, countryOfOrigin);
        this.packName = packName;
    }

    @Override
    public void makesSound() {
        System.out.println("AAAOOOEEEEHHH");
    }
}

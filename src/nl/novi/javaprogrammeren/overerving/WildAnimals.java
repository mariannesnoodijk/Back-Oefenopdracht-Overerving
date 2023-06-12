package nl.novi.javaprogrammeren.overerving;

public class WildAnimals extends Animal {

    String cageName;
    String lastFedOnWeekday;
    String countryOfOrigin;

    public WildAnimals(String name, String gender, String cageName, String lastFedOnWeekday, String countryOfOrigin) {
        super(name, gender);
        this.cageName = cageName;
        this.lastFedOnWeekday = lastFedOnWeekday;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCageName() {
        return cageName;
    }

    public void setCageName(String cageName) {
        this.cageName = cageName;
    }

    public String getLastFedOnWeekday() {
        return lastFedOnWeekday;
    }

    public void setLastFedOnWeekday(String lastFedOnWeekday) {
        this.lastFedOnWeekday = lastFedOnWeekday;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}

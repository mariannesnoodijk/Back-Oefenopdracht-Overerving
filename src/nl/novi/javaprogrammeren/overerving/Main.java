package nl.novi.javaprogrammeren.overerving;

public class Main {
    public static void main(String[] args) {

        Tiger tijgertje = new Tiger("Tijgertje", "male", "Casa di Tigre", "Wednesday", "India", 100);
        Lion simba = new Lion("Simba", "male", "Savanne", "Monday", "Africa", 5);
        Wolf david = new Wolf("David", "female", "Forest", "Sunday", "Canada", "Davids pack");
        Dog doggo = new Dog("Doggo", "non-binary", "Koen", "brokjes", "labrador");
        Cat monkey = new Cat("Monkey", "female", "Marianne", "alles", "tortoise", false);

        tijgertje.makesSound();
        simba.makesSound();

        david.move();

        doggo.sleep();

        monkey.eats(monkey.favoriteFood);
    }
}

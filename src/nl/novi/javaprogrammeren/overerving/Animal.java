package nl.novi.javaprogrammeren.overerving;

public class Animal {

   String name;
     String gender;

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    public void move() {
        System.out.println(this.name + " has moved 0.25m. ");
    }

    public void makesSound() {
        System.out.println(" ");
    }

    public void sleep() {
        System.out.println(this.name + " sleeps 8 hours per day.");
    }

    public void eats(String food) {
        System.out.println(this.name + " eats " + food);
    }

}

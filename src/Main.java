// Clasa Animal este clasa de baza pentru toate animalele
abstract class Animal {
    // constante
    final String NAME;
    final int AGE;

    // Constructor
    public Animal(String name, int age) {
        this.NAME = name;
        this.AGE = age;
    }

    // metoda abstracta care va fi implementata de subclase
    public abstract String makeSound();

    // metoda non-abstracta
    public void printDetails() {
        System.out.println("Name: " + this.NAME);
        System.out.println("Age: " + this.AGE);
    }
}

// Clasa Cat extinde clasa Animal si implementeaza interfata Pet
class Cat extends Animal implements Pet {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // implementarea metodei abstracte makeSound()
    public String makeSound() {
        return "Meow";
    }

    // implementarea metodei din interfata Pet
    public void play() {
        System.out.println("The cat is playing with a ball of yarn.");
    }
}

// Interfata Pet definește metoda play() care va fi implementată de clasele care implementează această interfață
interface Pet {
    default void play() {

    }
}

// Clasa Main
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Oskar", 5);
        myCat.printDetails(); // printeaza detalii despre pisica
        System.out.println("The cat says: " + myCat.makeSound()); // printeaza sunetul facut de pisica
        myCat.play(); // joaca cu pisica
    }
}

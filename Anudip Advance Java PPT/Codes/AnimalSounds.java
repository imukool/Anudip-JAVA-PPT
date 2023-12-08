// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        // Creating instances of each class
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Displaying the sounds made by each object
        System.out.println("Animal:");
        animal.makeSound(); // Calls makeSound() from Animal class

        System.out.println("\nDog:");
        dog.makeSound(); // Calls overridden makeSound() from Dog class

        System.out.println("\nCat:");
        cat.makeSound(); // Calls overridden makeSound() from Cat class
    }
}

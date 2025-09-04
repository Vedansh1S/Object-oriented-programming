package poly;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class Polymorphism_tutorial {
    public static void main(String[] args) {
        // 6. A reference of the superclass type
        Animal myAnimal;

        // 7. Pointing to a Dog object
        myAnimal = new Dog();
        // This will call the Dog's version of makeSound()
        myAnimal.makeSound(); // Output: The dog barks: Woof! Woof!

        // 8. Now pointing to a Cat object (this is the "polymorphism")
        myAnimal = new Cat();
        // This will call the Cat's version of makeSound()
        myAnimal.makeSound(); // Output: The cat meows: Meow!
    }
}

package poly;

class Animal {
    public void makeSound() { // When declared static, this method cannot be overridden
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
        Animal myAnimal;              // 6. A reference of the superclass type
        myAnimal = new Animal();      // 6. Pointing to an Animal object
        myAnimal.makeSound();         // This will call the Animal's version of makeSound() Output: The animal makes a generic sound.

        myAnimal = new Dog();         // 7. Pointing to a Dog object
        myAnimal.makeSound();         // This will call the Dog's version of makeSound()  Output: The dog barks: Woof! Woof!

        myAnimal = new Cat();         // 8. Now pointing to a Cat object (this is the "polymorphism")
        myAnimal.makeSound();         // This will call the Cat's version of makeSound() Output: The cat meows: Meow!
    }
}

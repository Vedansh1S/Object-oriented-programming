package abstraction;

abstract class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("\nI am the father of these Animals. hehehehe");
    }

    void greeting(){
        System.out.println("Hello, how are you.");
    }

    void food() {
        System.out.println("This animal eats food");
    }

    abstract void sound();
}

class Dog extends Animal {

    public Dog(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void sound() {
        System.out.println("This makes woof woof sound\n");
    }
}

class Cat extends Animal {

    public Cat(int age) {
        super(age);
        // this.age = age;
    }

    @Override
    void sound() {
        System.out.println("This makes meow meow sound");
    }
}

public class tutorial {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal(); error
        Animal myDog = new Dog(20);
        Animal myCat = new Cat(10);

        System.out.println("Dogs age is: " + myDog.age);
        myDog.food();
        myDog.sound();

        System.out.println("Cats age is: " + myCat.age);
        myCat.food();
        myCat.sound();
        myCat.greeting();

        Animal.hello();
    }
}

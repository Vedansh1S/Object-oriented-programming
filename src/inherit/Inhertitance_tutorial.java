package inherit;

class Common_Vehicle_Properties {
    private String NumberPlate;

    public Common_Vehicle_Properties(String NumberPlate) {
        super(); // every class has Object class as superClass and it is the root of the class
                 // hierarchy
        this.NumberPlate = NumberPlate;
    }

    public void Honk() {
        System.out.println("Tuut Tuut");
    }

    public void display() {
        System.out.println("Number Plate : " + NumberPlate);
    }

    protected String getNumberPlate() {
        return NumberPlate;
    }
}

class Car extends Common_Vehicle_Properties {
    // private String NumberPlate; // this is a subclass variable and it is not the same as the superclass variable
    // super.NumberPlate; // this is a superclass variable and it is the same as the superclass variable
    public Car(String CarNumberPlate) {
        super(CarNumberPlate);
    }

}

class Bus extends Common_Vehicle_Properties {

    public Bus(String BusNumberPlate) {
        super(BusNumberPlate);
    }
}

public class Inhertitance_tutorial {
    public static void main(String[] args) {
        // Common_Vehicle_Properties vehicle = new Car("MH-14-AB-1234"); -> this is a good example of upcasting referenced to the superclass and it can hold the object of the subclass
        // you cannot access the methods of the subclass in upcasting but you can access the methods of the superclass

        // Car newCar = new Common_Vehicle_Properties("MH-14-AB-1234"); -> this is a good example of downcasting, referenced to the subclass and it can hold the object of the superclass
        // you can access the methods of the subclass in downcasting but not the methods of the superclass
        Car newCar = new Car("MH-14-AB-1234");
        newCar.display();
        newCar.Honk();

        System.out.println();

        Bus newBus = new Bus("MH-14-XY-5678");
        newBus.display();
        newBus.Honk();
    }

}

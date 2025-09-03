package Poly;

class Common_Vehicle_Properties {
    private String NumberPlate;

    public Common_Vehicle_Properties(String NumberPlate) {
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
    public Car(String CarNumberPlate) {
        super(CarNumberPlate);
    }

    @Override
    public void display() {
        System.out.println("Number Plate of Car: " + getNumberPlate());
    }
}

class Bus extends Common_Vehicle_Properties {

    public Bus(String BusNumberPlate) {
        super(BusNumberPlate);
    }

    @Override
    public void display() {
        System.out.println("Number Plate of Bus: " + getNumberPlate());
    }
}

public class Assignment {
    public static void main(String[] args) {
        Common_Vehicle_Properties vehicle;
        vehicle = new Car("MH-14-AB-1234");
        vehicle.display();
        vehicle.Honk();

        System.out.println();

        vehicle = new Bus("MH-14-XY-5678");
        vehicle.display();
        vehicle.Honk();
    }
}

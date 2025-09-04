package inherit;

class Common_Vehicle_Properties{
    private String NumberPlate;

    public Common_Vehicle_Properties(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }

    public void Honk(){
        System.out.println("Tuut Tuut");
    }

    public void display(){
        System.out.println("Number Plate : " + NumberPlate);
    }

    protected String getNumberPlate(){
        return NumberPlate;
    }
}

class Car extends Common_Vehicle_Properties{
    public Car(String CarNumberPlate) {
        super(CarNumberPlate);
    }
   
}

class Bus extends Common_Vehicle_Properties{

    public Bus(String BusNumberPlate) {
        super(BusNumberPlate);
    }
}

public class Inhertitance_tutorial {
    public static void main(String[] args) {
        Car newCar = new Car("MH-14-AB-1234");
        newCar.display();
        newCar.Honk();

        System.out.println();
        
        Bus newBus = new Bus("MH-14-XY-5678");
        newBus.display();
        newBus.Honk();  
    }

}

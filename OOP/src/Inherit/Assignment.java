package inherit;

class Vehicle {
    private String CarBrand;

    public Vehicle(String CarBrand) {
        this.CarBrand = CarBrand;
        System.out.println("Base class called");
        System.out.println();
    }

    public void engine() {
        System.out.println("Vroom Vroom");
    }

    public String getBrand() {
        return this.CarBrand;
    }
}

class model extends Vehicle {
    private String modelName;

    public model(String brand, String modelName) {
        super(brand);
        this.modelName = modelName;
        System.out.println("Derived class called");
        System.out.println();
    }

    public void Display() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + modelName);
        System.out.println();
    }
}

public class Assignment {
    public static void main(String[] args) {
        model myModel = new model("Ford", "Mustang");
        myModel.Display();
        myModel.engine();
    }
}

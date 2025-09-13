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
//    private String CarBrand;
 //   super.CarBrand; // this is a superclass variable and it is the same as the superclass variable
 //   this.CarBrand; // this is a subclass variable and it is not the same as the superclass variable
 public model(String brand, String modelName) {
        super(brand);  // if this is not present, then the superclass constructor will be called
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

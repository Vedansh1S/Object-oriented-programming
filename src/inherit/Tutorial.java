package inherit;

class Box {
    private int length;
    private int width;

    public Box() {
        this.length = 10;
        this.width = 10;
    }

    public Box(int side) {
        this.length = side;
        this.width = side;
    }

    public Box(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Box(Box other) {
        this.length = other.length;
        this.width = other.width;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

}

class AverageBox extends Box {
    private int weight;

    public AverageBox() {
        super();
        this.weight = 10;
    }

    public AverageBox(int side, int weight) {
        super(side);
        this.weight = weight;
    }

    public AverageBox(int length, int width, int weight) {
        super(length, width);
        this.weight = weight;
    }

    public AverageBox(AverageBox other) {
        super(other);
        this.weight = other.weight;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Weight: " + weight);
    }

}

class SmallBox extends AverageBox {
    private int price;

    public SmallBox() {
        super();
        this.price = 10;
    }

    public SmallBox(int side, int weight, int price) {
        super(side, weight);
        this.price = price;
    }

    public SmallBox(int length, int width, int weight, int price) {
        super(length, width, weight);
        this.price = price;
    }

    public SmallBox(SmallBox other) {
        super(other);
        this.price = other.price;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Price: " + price);
    }

}

public class Tutorial {
    public static void main(String[] args) {
        AverageBox averageBox = new AverageBox(10, 20, 30);
        averageBox.display();

        System.out.println();

        // to test copy constructor
        SmallBox original = new SmallBox(50, 60, 70);
        original.display();

        System.out.println();

        // to test copy constructor
        SmallBox smallBox2 = new SmallBox(original);
        smallBox2.display();
    }

}

package Interfacess;

interface watterbottle {
    public void level();

    default void color() {
        System.out.println("blue");
    }
}

interface temperature extends watterbottle {
    public void temp();

    default void color() {
        System.out.println("white");
    }
}

class Bottle implements temperature {
    @Override
    public void level() {
        System.out.println("The level of bottle is half");
    }

    @Override
    public void temp() {
        System.out.println("The temperature is normal");
    }
}

public class Example {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.level();
        bottle.temp();
        bottle.color();
    }
}

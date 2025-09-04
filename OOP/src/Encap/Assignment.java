package encap;

class thermostat {
    private double temperatureCelsius;

    public thermostat(double temperatureCelsius) { // -> 2nd step
        // this.temperatureCelsius = 1;
        this.setTemperatureCelsius(temperatureCelsius);
    }

    // getter for celc ius
    public double getTemperatureCelsius() { // -> 6th step
        return this.temperatureCelsius;
    }

    // getter for farenheit
    public double getTemperatureFahrenheit() { // -> 8th step
        double F = (temperatureCelsius * 9 / 5) + 32;
        return F;
    }

    // setter
    public void setTemperatureCelsius(double temperature) { // -> 3rd step
        if (temperature < 40 && temperature > 0) {
            this.temperatureCelsius = temperature;
        } else {
            System.out.println("Enter valid Temperature.");
            this.temperatureCelsius = 0;
        }
    }

    public void display() {
        System.out.println("Temperature in celcius is: " + getTemperatureCelsius()); // -> 5th step
        System.out.println("Temperature in Farenhite is: " + getTemperatureFahrenheit()); // -> 7th step
    }

}

public class Assignment {
    public static void main(String[] args) {
        thermostat temperature1 = new thermostat(35); // -> 1st step
        temperature1.display(); // -> 4th step
        System.out.println();

        temperature1.setTemperatureCelsius(50);
        temperature1.display();
        System.out.println();

        temperature1.setTemperatureCelsius(10);
        temperature1.display();

    }
}

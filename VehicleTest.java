interface Vehicle{  // Interface representing a Vehicle
    void start();
    void stop();
    double getFuelLevel();
}

class Car implements Vehicle{  // Concrete class representing a Car
    private double fuelLevel;
    
    public Car(double fuelLevel){   // Constructor
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start(){
        System.out.println("Car is starting... Vroooom...");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping...");
    }

    @Override
    public double getFuelLevel(){
        return fuelLevel;
    }
}


class Motorcycle implements Vehicle{  // Concrete class representing a Motorcycle
    private double fuelLevel;

    public Motorcycle(double fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start(){
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public double getFuelLevel(){
        return fuelLevel;
    }
}

// Main class to demonstrate runtime polymorphism
public class VehicleTest {
    public static void main(String[] args){
        // Using Vehicle reference for Car object
        Vehicle myCar = new Car(50.5);
        myCar.start();
        System.out.println("Car Fuel Level: " + myCar.getFuelLevel() + " liters");
        myCar.stop();

        System.out.println(); // For better readability

        // Using Vehicle reference for Motorcycle object
        Vehicle myMotorcycle = new Motorcycle(15.2);
        myMotorcycle.start();
        System.out.println("Motorcycle Fuel Level: " + myMotorcycle.getFuelLevel() + " liters");
        myMotorcycle.stop();
    }
}

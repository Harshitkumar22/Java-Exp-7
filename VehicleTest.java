interface Vehicle{  // Interface representing a Vehicle
    void start();
    void stop();
    double getFuelLevel();
}

class Car implements Vehicle{  // Concrete class car
    private double fuelLevel;
    
    public Car(double fuelLevel){  // Constructor
        this.fuelLevel=fuelLevel;
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


class Motorcycle implements Vehicle{  // Concrete Motorcycle
    private double fuelLevel;

    public Motorcycle(double fuelLevel){
        this.fuelLevel=fuelLevel;
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
public class VehicleTest{
    public static void main(String[] args){
        Vehicle myCar=new Car(50.5);
        myCar.start();
        System.out.println("Car Fuel Level: " + myCar.getFuelLevel() + " liters");
        myCar.stop();

        System.out.println();

        Vehicle myMotorcycle = new Motorcycle(15.2);
        myMotorcycle.start();
        System.out.println("Motorcycle Fuel Level: " + myMotorcycle.getFuelLevel() + " liters");
        myMotorcycle.stop();
    }
}
package Inheritance;

public class Vehical {
    private String engine;
    private int wheels;
    private int seats;
    private int fueTank;
    private String lights;

    public Vehical(){
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 5;
        this.fueTank = 34;
        this.lights = "LED";
    }

    public Vehical(String engine, int wheels, int seats, int fueTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fueTank = fueTank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFueTank() {
        return fueTank;
    }

    public String getLights() {
        return lights;
    }
}

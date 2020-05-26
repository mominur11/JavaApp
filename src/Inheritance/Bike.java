package Inheritance;

public class Bike extends Vehical{
    private String handle;

    public Bike(){
        super();
        this.handle = "two Handle";
    }

    public Bike(String handle, String engine, int wheels, int seats, int fueTank, String lights) {
        super(engine,wheels,seats,fueTank,lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }
    @Override
    public String toString() {
        return "Bike{" +
                "getHandle()='" + getHandle()+ '\'' +
                "getengine='" + getEngine()+ '\'' +
                ", wheels=" + getWheels() +
                ", seats=" + getSeats() +
                ", fueTank=" + getFueTank() +
                ", lights='" + getLights() + '\'' +
                '}';
    }
    public void run(){
        System.out.println("Runing bike");
        System.out.println(toString());
    }
}

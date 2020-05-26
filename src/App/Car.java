package App;

public class Car {

    private String doors;
    private String engine;
    private String drivers;
    private int speed;

    public Car(String doors, String engine, String drivers, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.drivers = drivers;
        this.speed = speed;
    }

    public Car() {
         doors = "opened";
         engine = "off";
         drivers = "absent";
         speed = 0;
    }

    public int getspeed() {
        return speed;
    }

    public String getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }

    public String getDrivers() {
        return drivers;
    }

    public String run() {
        if(doors.equals("closed") && engine.equals("on")&& drivers.equals("seated")
                && speed >0) {
            return "car is running";
        }else {
            return "car is not running";
        }
    }
}

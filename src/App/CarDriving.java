package App;

public class CarDriving {
    public static void main(String[] args) {

        Car car = new Car("closed","on","seated",10);
        System.out.println(car.run());
    }
}
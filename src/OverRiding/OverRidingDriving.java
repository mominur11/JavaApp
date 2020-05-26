package OverRiding;

public class OverRidingDriving {

    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.run();

        Car c = new Car();
        c.run();

        //another option
        Vehicle vCar = new Car();
        vCar.run();


    }
}

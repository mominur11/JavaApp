package SoftwareDesign;

public class InterfaceSegregation {

    public static void main(String[] args){

    }
}

interface Worker{
    public void work();

}

interface Sleep{
    public void sleep();
}

class Student implements Worker,Sleep{

    @Override
    public void work() {

    }
    @Override
    public void sleep() {

    }
}

class Engine implements Worker{

    @Override
    public void work() {

    }
}

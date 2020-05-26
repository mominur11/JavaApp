package Polymorphism;

public class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public void holdOnPhone(){
        System.out.println("On Hold phone");
    }

    public String getModel() {
        return model;
    }
}

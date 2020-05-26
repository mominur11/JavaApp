package Composition;

public class House {
    private Kitchen kitchen;
    public House(){
        kitchen = new Kitchen();
        kitchen.setFood("Rich");
    }

    public String getFood(){
        return kitchen.getFood();
    }
}

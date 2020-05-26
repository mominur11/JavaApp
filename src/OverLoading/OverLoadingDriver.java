package OverLoading;

public class OverLoadingDriver {
    public static void main(String[] args){
        Addition add = new Addition();
        add.sum(10,25);
        add.sum(10,25,50);
        add.sum(10.35,20.00);
    }
}

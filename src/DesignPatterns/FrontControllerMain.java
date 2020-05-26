package DesignPatterns;

public class FrontControllerMain {
    public static void main(String[] args){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("1");
        frontController.dispatchRequest("2");
    }
}

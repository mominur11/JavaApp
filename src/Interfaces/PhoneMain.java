package Interfaces;

public class PhoneMain {

    public static void main(String[] args) {

        Phone phone = new OnePlus5();
        Phone phone2 = new Iphone8();
        System.out.println("Processor: " + phone.processor());
        System.out.println("Space in GB: " + phone.spaceInGB());
        System.out.println();
        System.out.println("Another Phone: Iphone8");
        System.out.println("Processor: " + phone2.processor());
        System.out.println("Space in GB: " + phone2.spaceInGB());
    }
}

package Polymorphism;

public class PhoneDriving {
    public static void main(String[] args) {

        Phone nokia3310 = new PhoneDriving().phone(1);
        System.out.println(nokia3310.getModel());
        nokia3310.holdOnPhone();

        Phone note8 =  new PhoneDriving().phone(2);
        System.out.println(note8.getModel());
        note8.holdOnPhone();
    }

    public Phone phone(int dailyDriver){
        switch(dailyDriver){
            case 1: return new Nokia("3310");
            case 2: return new Samsung("Note 5");
        }
        return null;
    }
}

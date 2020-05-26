package App;

import java.util.Scanner;

public class RingingAlam {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("1. Hit Stop");
        System.out.println("2. Hit Snooze");
        System.out.println("Select Ine Option: ");

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if(i == 1){
            System.out.println("Alam Stopped");
        }else {
            System.out.println("Ringing suspended for 10 seconds");
            Thread.sleep(10000);
            System.out.println("Beep Beep Beep.........");
        }
        s.close();
    }
}

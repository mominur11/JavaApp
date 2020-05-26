package Abstration;

 class Samsung extends Mobilee{

     @Override
     void calling(String number) {
         System.out.println("Calling form Samsung...."+ number);
     }

     @Override
     void sendMessage(String message) {
         System.out.println("sending message form samsung...."+ message);
     }
 }

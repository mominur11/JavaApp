package Abstration;

import java.util.ArrayList;

interface Mobile {

    public void calling(String number);
    public void sendMessage(String message);
}

class  Apple implements Mobile{

    private ArrayList<String> contacts = new ArrayList<String>();
    public void addContacts(String number)
    {
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling...."+ number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Send message...."+ message);
    }
}




public class AbstractionDemo {
    public static void main(String[] args){

        Apple myPhone = new Apple();
        myPhone.calling("2121313");
        myPhone.sendMessage("Wellcome");
        myPhone.addContacts("2061123");


        Samsung myNewPhone = new Samsung();
        myNewPhone.addContact("7666777");
        myNewPhone.calling("monier");
        myNewPhone.sendMessage("3332323");
    }
}

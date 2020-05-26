package Abstration;
import java.util.ArrayList;

abstract class Mobilee {

    ArrayList<String> list = new ArrayList<String>();
    abstract void calling(String number);
    abstract void sendMessage(String message);

    public void addContact (String contact){
        list.add(contact);
    }
}


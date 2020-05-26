package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamp {

    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Bangladesh");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Russia");

        new LinkedListExamp().printList(countries);
        countries.add(1,"Canada");
        countries.add("Brazil");
        countries.set(7,"Brazil");
        new LinkedListExamp().printList(countries);
    }

    void printList(List<String> list){
        for(String element: list){
            System.out.println("Element: "+element);
        }
        System.out.println("*****************************");
    }
}

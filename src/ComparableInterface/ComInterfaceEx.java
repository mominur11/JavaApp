package ComparableInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ComInterfaceEx {
    public static void main(String[] args) {

        List <Object> elements = new LinkedList<>();
        elements.add(new Names("Chaand"));
        elements.add(new Names("Ed"));
        elements.add(new Names("John"));
        elements.add(new Names("Mia"));
        elements.add(1);
        elements.add(2.3);
        elements.add("Sumon");

        ComInterfaceEx app = new ComInterfaceEx();
        app.printList(elements);
    }

    void printList(List<Object> list){
        ListIterator<Object> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Element: "+iterator.next());
        }
    }
}


class Names {

    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
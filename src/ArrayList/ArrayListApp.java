package ArrayList;

import java.util.ArrayList;
public class ArrayListApp {

    static ArrayList<String> listName = new ArrayList<>();

    public static void main(String[] args) {

        listName.add("Ruma");
        listName.add("Sumon");
        listName.add("Kamal");

        ArrayListApp app = new ArrayListApp();
        app.displayList(listName);

        System.out.println("************");
        System.out.println("Last Name Added: "+listName.get(2));
        System.out.println("************");
        System.out.println("Removed (Sumon) from Lists: ");
        app.removeNameByString("Sumon");
        app.displayList(listName);

        System.out.println("************");
        int position = app.search("Kamal");
        if(position !=-1){
            app.modifyName(position,"Dulal");
            app.displayList(listName);
        }else {
            System.out.println("Invalid Entry");
        }
    }


    void displayList(ArrayList<String> names){
        for(String name: names){
            System.out.println(name);
        }
    }

    void removeNameByPosition(int position){
        listName.remove(position);
    }
    void removeNameByString(String name){
        listName.remove(name);
    }

    void modifyName(int position, String newName){
        listName.set(position, newName);
    }

    int search(String name){
        return listName.indexOf(name);
    }
}
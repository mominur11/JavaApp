package Association;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String sub){
        this.name = name;
        this.subject = sub;
    }

    @Override
    public String toString() {
        return "[Teacher :" +name+", Subject :" +subject+"]";

    }
}

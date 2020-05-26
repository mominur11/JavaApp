package Association;

import java.util.List;

public class College {
    String name;
    private List<Teacher>teacher;
    public College(String name, List<Teacher>teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public List<Teacher>getTeacher(){
        return teacher;
    }
}


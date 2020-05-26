package Association;

import java.util.ArrayList;
import java.util.List;

public class AggregationDriving {

    public static void main(String[] args){

        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Sumon","Java"));
        teachers.add(new Teacher("Runy","Php"));

        College college = new College("Bogra College",teachers);
        System.out.println(college.getTeacher());
    }
}

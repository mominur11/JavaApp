package Parallel;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDriver {

    public static void main(String[] args){
        long time1, time2;
        List<Employee>eList = new ArrayList<Employee>();
        for (int i = 0; i <100; i++){
            eList.add(new Employee("Ruma",2000));
            eList.add(new Employee("Sumon",300));
            eList.add(new Employee("Kamal",5000));
            eList.add(new Employee("Rony",6000));
            eList.add(new Employee("Monier",7000));
            eList.add(new Employee("Hanif",15000));
        }
        //Sequential Processing

        time1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count = "+eList.stream().filter(e -> e.getSalary() >100).count());

        time2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken = " +(time2 - time1)+"\n");

        //Parallel Processing
        time1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count = "+eList.parallelStream().filter(e -> e.getSalary() >100).count());

        time2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken = " +(time2 - time1));


    }
}

package MVC;

import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        System.out.println(id);

        //Validations on Id
        Employee model = getDataFromDatabase(id);

        EmployeeView view = new EmployeeView();
        view.ShowDetails(model);

        //Updation
        model.setDepartment("Java");
        System.out.println("After Updation: ");
        view.ShowDetails(model);

    }

    private static Employee getDataFromDatabase(int id){
        Employee emp = new Employee();
        if(id == 101){
            //Fetching data for id 101 from database
            emp.setName("Runa");
            emp.setDepartment("Python");
        }
        return emp;
    }
}

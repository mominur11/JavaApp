package MVC;

public class EmployeeView {

    public void ShowDetails(Employee data){
        System.out.println("Employee: " + data.getName());
        System.out.println("Department: " + data.getDepartment());
    }
}

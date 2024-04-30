import java.util.*;
import java.util.UUID; // Universal Unique Identifier
public class Employee extends Showroom implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;


    @Override
    public void get_details() {
        System.out.println("ID:" + emp_id);
        System.out.println("Employee Name:" + emp_name);
        System.out.println("AGE:" + emp_age);
        System.out.println("Department:" + emp_department);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("*********************|| ENTER EMPLYOEE DETAILS ||*****************************************");
        System.out.println();
        System.out.print("Employee Name: ");
        emp_name=sc.nextLine();
        System.out.print("Employee Age: ");
        emp_age=sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Department: ");
        emp_department=sc.nextLine();
        System.out.print("Showroom Name: ");
        showroom_name=sc.nextLine();
    }


}
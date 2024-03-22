package Challenge7.EmployeeDetails;

public class EmployeeTest {
       public static void main(String[] args) {
              Employee employee = new Employee("Chirag Soni", 19, 50000);
              System.out.println(employee.getEmployeeDetails());
              employee.setSalary(80000);
              employee.setAge(20);
              System.out.println(employee.getEmployeeDetails());
       }
}

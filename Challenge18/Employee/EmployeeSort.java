package Employee;

public class EmployeeSort {
       private final String name;
       private final int salary;
       public EmployeeSort(String name, int salary) {
              this.name = name;
              this.salary = salary;
       }
       public String getName() {
              return name;
       }
       public int getSalary() {
              return salary;
       }
       @Override
       public String toString() {
              return "Employee [name=" + name + ", salary=" + salary + "]";
       }
       

       
}

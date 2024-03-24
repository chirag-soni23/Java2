package Employee;
import java.util.List;

public class TestingEmployee {
       public static void main(String[] args) {
              List<EmployeeSort> employee = List.of(
                     new EmployeeSort("Chirag",50000),
                     new EmployeeSort("Abhishek",10000),
                     new EmployeeSort("Rakesh",30000),
                     new EmployeeSort("Mohan",20000)
                    
              );
              employee.stream().sorted((emp1,emp2)->emp1.getSalary() - emp2.getSalary()).forEach(System.out::println);
              
       }
}

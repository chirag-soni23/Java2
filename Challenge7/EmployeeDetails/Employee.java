package Challenge7.EmployeeDetails;

public class Employee {
       private String name;
       private int age;
       private double salary;

       public Employee(String name, int age, double salary) {
              this.name = name;
              this.age = age;
              this.salary = salary;
       }

       public Employee(String string, int i) {
              //TODO Auto-generated constructor stub
       }

       String getEmployeeDetails(){
              return "Employee Details:- Name: " + name + ", age: " + age + ", salary: " + salary;

       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public int getAge() {
              return age;
       }

       public void setAge(int age) {
              this.age = age;
       }

       public double getSalary() {
              return salary;
       }

       public void setSalary(double salary) {
              this.salary = salary;
       }

}

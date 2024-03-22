package FunctionalProgramming;

public class TestingLmada {
       public static void main(String[] args) {
              TestingLmada test = new TestingLmada();
              test.sum(2, 3);
              test.printString("Test Print");

              // toPrint -> System.out.println(toPrint)
              // (a,b) -> {int sum = a + b; System.out.println(sum)}
              // (a,b) -> a+b
              // (a,b) -> return (a+b)


       }

       private void printString(String toPrint){
              System.out.println(toPrint);      
       }

       private int sum(int a,int b){
              int sum = a + b;
              return sum;
              
       }
}

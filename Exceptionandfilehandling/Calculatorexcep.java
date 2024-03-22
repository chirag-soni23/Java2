import java.util.Scanner;

public class Calculatorexcep {
       public static void main(String[] args) {
              a();
       }

       private static void a() {
              b();

       }

       private static void b() {
              c();

       }

       private static void c() {
              d();

       }

       private static void d() {
              @SuppressWarnings("resource")

              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to file handling exception");
              System.out.print("Please enter first number: ");
              int first = input.nextInt();
              System.out.print("Now, enter a second number: ");
              int second = input.nextInt();
              try {
                     // int[] a = new int[5];
                     // System.out.println(a[6]);
                     // a[6] = 3;
                     int result = first / second;
                     System.out.printf("The result is %d", result);
              } catch (ArithmeticException exception) {
                     System.out.println("The exceptions is " + exception.getMessage());

              } catch (ArrayIndexOutOfBoundsException e) {
                     System.out.println(e.getMessage());
              } catch (Throwable th) {
                     System.out.println("General exception");
                     throw th;
              }
              finally{
                     System.out.println("I am finally");
              }

       }
}
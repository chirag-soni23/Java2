import java.util.Scanner;

public class Execpcalculator {
       @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome exception handling calculator");
        System.out.print("Please, Enter a first number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter a second number: ");
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.println("The result is " + result);
        }catch (ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Divide zero is occured");
            }
            else{
                throw e;
            }

        }


    }
}

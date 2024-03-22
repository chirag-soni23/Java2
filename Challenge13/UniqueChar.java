import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
       @SuppressWarnings("resource")
       public static void main(String[] args) {
              Set<Character> unique = new HashSet<>();
              Scanner input = new Scanner(System.in);
              System.out.print("Please enter a string: ");
              String userStr = input.next();
             for (char c : userStr.toCharArray()) {
              unique.add(c);
             }
             System.out.printf("The unique element is %s",unique.size());

       }
}

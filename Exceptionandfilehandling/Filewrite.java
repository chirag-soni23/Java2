import java.io.FileWriter;
import java.io.IOException;
public class Filewrite {
       public static void main(String[] args) {
              String Filename = "Java-course.txt";
              try (FileWriter writer = new FileWriter(Filename)) {
                     writer.write("This is a Java Course\n");
                     for (int i = 1; i <= 5; i++) {
                            writer.write("\n");
                            for(int j = 1;j<=i;j++){
                                   writer.write("* ");
                            }
                     }
                     writer.flush();
                     System.out.println("File Written Successfully.");
              } catch (IOException exception) {
                     System.out.printf("Exception occured: %s", exception.getMessage());
              }
       }

}

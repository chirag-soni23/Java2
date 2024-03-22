import java.io.FileReader;
import java.io.IOException;

public class Fileread {
       public static void main(String[] args) {
              String fileName = "Java-course.txt";
              try(FileReader reader = new FileReader(fileName)){
                     int read = 0;
                     do {
                            read = reader.read();
                            System.out.print((char)read);
                     } while (read != -1);

              }catch(IOException exception){
                     System.out.printf("Exception occurres: %s",exception.getMessage());
              }
       }
}

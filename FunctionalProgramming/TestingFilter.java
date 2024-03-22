package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
       public static void main(String[] args) {
               List<String> fruits = List.of("apple", "banana", "cherry", "date");
              System.out.println(fruits.size());
              for (String fruit : fruits) {
                     System.out.println(fruit);
              }


              System.out.println("Print using stream forEach method");
              fruits.stream().forEach(new Consumer<String>() {
                     @Override
                     public void accept(String fruit){
                            System.out.println(fruit);
                     }
                     
              });

              System.out.println("Print using filter method");
              fruits.stream().filter(fruit -> fruit.endsWith("a")).forEach(fruit -> System.out.println(fruit));

       }
       
}

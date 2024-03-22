package CollectionandGeneric;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapital {
       public static void main(String[] args) {
              Map<String,String> countryMap = new HashMap<>();
              countryMap.put("India", "Delhi");
              countryMap.put("France", "Paris");
              countryMap.put("Russia", "Moscow");
              countryMap.put("Italy", "Rome");
              countryMap.put("Germany", "Berlin");
              @SuppressWarnings("resource")
              Scanner input = new Scanner(System.in);
              System.out.println("Welcome to Country");
              System.out.println("Please, Enter a Country Name: ");
              String country = input.next();
              if(countryMap.containsKey(country)){
                     System.out.printf("%s : %s",country,countryMap.get(country));
              }
              else{
                     System.out.println("Sorry, Country not found");
              }

       }
}

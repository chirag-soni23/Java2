package Challenge8.ArrayOperation;

public class ArrayOperation {
       int[] numbers;

       public ArrayOperation(int[] numbers) {
              this.numbers = numbers;
       }

       public class Statistic{
              public static double mean(int[] numbers){
                     double sum = 0;
                     for (int number: numbers) {
                            sum += number;
                            
                     }
                     return sum / numbers.length;


              }

       }

       
       
}

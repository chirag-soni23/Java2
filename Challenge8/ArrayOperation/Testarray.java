package Challenge8.ArrayOperation;

public class Testarray {
       @SuppressWarnings("static-access")
       public static void main(String[] args) {
              ArrayOperation opr = new ArrayOperation(new int[] {1,2,3,4,5});
              ArrayOperation.Statistic statistic = opr.new Statistic();
              System.out.println(statistic.mean(opr.numbers));
       }
}

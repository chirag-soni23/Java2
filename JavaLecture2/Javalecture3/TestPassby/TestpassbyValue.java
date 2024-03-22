package TestPassby;

public class TestpassbyValue {
       public static void main(String[] args) {
              int x = 12;
              int y = 8;
              int sum = add(x,y);
              System.out.printf("x=%d, y=%d, sum=%d",x,y,sum);
       }
       public static int add(int a, int b){
              a += b;
              return a;
       }
}

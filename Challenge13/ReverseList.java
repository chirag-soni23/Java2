import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class ReverseList {
       public static void main(String[] args) {
              List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
              System.out.println(list);
              reverse(list);
              System.out.println(list);
              
       }

       public static void reverse(List<Integer> list){
              // Collections.reverse(list);
              int l = 0;
              int r = list.size() - 1;
              while(l<r){
                     int swap = list.get(l);
                     list.set(l,list.get(r));
                     list.set(r,swap);
                     l++;
                     r--;
              }

       }
}

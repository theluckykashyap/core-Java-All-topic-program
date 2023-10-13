package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenOdd  {
    public static void main(String[] args) {
       // EvenOdd evenOdd = new EvenOdd();
       // test i2=(int a)->{

        Predicate<Integer> even = n-> n % 2 == 0;
        Predicate<Integer>odd=n->n%2 !=0;
        List<Integer> list= Arrays.asList(12,34,37,78,97,50,49,30);
        list.stream().filter(even).forEach(System.out::println);
        System.out.println("======================================");
        list.stream().filter(odd).forEach(System.out::println);

        // Check my string is empty or not
        Predicate<String>  checkString= str->str.isEmpty();
        System.out.println(checkString.test(""));
        // String covert uppercase and lowercase
     




      /*  };
         i2.evenOdd2(20);
*/
    }

    /*    @Override
    public void evenOdd2(int a) {
          for (int i=1;i<=a;i++){
              if(i%2==0)
              System.out.println("even Number"+i);
              else System.out.println("odd Number "+i);
          }*/

    }

interface test{
    void evenOdd2(int a);
}

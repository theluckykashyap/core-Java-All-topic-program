package Interfaces;

import java.lang.annotation.Annotation;

@FunctionalInterface
public interface FunctionalInterfaces {
    int calculate(int x);


}
class main3 {

    public static void main(String[] args) {
        int a=10;
      FunctionalInterfaces  anInterface=(x) -> x * x ;

      int ans=anInterface.calculate(a);
        System.out.println(ans);


    }

}
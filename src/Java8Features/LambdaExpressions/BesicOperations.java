package Java8Features.LambdaExpressions;

import com.sun.source.doctree.SummaryTree;

import java.util.function.DoubleToIntFunction;

public class BesicOperations {




        interface Sum {
            int  getSumC(int a, int b) ;


        }
    private int operate(int a, int b, Sum sum) {
        return sum.getSumC(a,b);
    }
    public static void main(String[] args) {

            BesicOperations operations =new BesicOperations();

            Sum sum= (a,b)-> a+b;
        System.out.println("Addition is "
                + operations.operate(6, 3, sum));

    }


}
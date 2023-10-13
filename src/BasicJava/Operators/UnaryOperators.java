package BasicJava.Operators;

public class UnaryOperators {
    // Unary Operators are used to increment and decrement
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        // Unary Minus
        System.out.println("Unary minus : " + (-a));
        // Unary Plus
        System.out.println("Unary Plus : " + (+a));
        // increment operator
        System.out.println("increment operator : " + (a++));
        // decrement operator
        System.out.println("decrement operator : " + (--a));
        // Logical not  operator it means return booleans value
        System.out.println("Logical not  operator : " + (b != a));// its output is true .reason is always
        //return opposite value

        /*
        Output :-
       Unary minus : -10
       Unary Plus : 10
       increment operator : 10
       decrement operator : 10
       Logical not  operator : true
        * */

    }
}

package BasicJava.Operators;

public class TernaryOperator {
    // it is shorthand version of  if - else statement.
    public static void main(String[] args) {
        int i=10,k=19;
     int    result =( (i>k) ? i : k);
        System.out.println("we are using ternaryOperator :"+result);
    }
}
    /*Output
    we are using ternaryOperator :19*/
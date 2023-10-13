package BasicJava.Operators;

public class RelationalOperator {
    // we are used Relational Operator for related like equality,greater than ,lass than
    // they return boolean result
    public static void main(String[] args) {
        int k=10;
        int f=15;

        // using == operator
        System.out.println("using == operator :"+(k==f));
        // using != operator
        System.out.println("using != operator :"+(k !=f));
        //< lass than
        System.out.println("lass than operator : "+(k<f));
        // > greater than
        System.out.println("greater than operator :"+(k>f));

        /*
        output
        using == operator :false
        using != operator :true
        lass than operator : true
        greater than operator :false*/


    }
}

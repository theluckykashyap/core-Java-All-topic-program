package BasicJava.Operators;



public class AssignmentOperator {
    // Assignment Operator we are used to assign a value to any variable .
    public static void main(String[] args) {
        int a=30;
        int d=10;
        int c=2;
        // = operator
        int b=c;
        System.out.println(" Assign value a to b using (=) operator  "+b);

        // += operator
        System.out.println("using += :"+(a+=a));
        // -= operator
        System.out.println("using -= :"+(a-=a));
        // /= operator
        System.out.println("using /= :"+(d/=d));
        // *= operator
        System.out.println("using *= :"+(c*=c));
        // %= operator
        System.out.println("using %= :"+(c%=c));

       /*
        Output
        Assign value a to b using (=) operator  2
        using += :60
        using -= :0
        using /= :1
        using *= :4
        using %= :0
*/


    }
}

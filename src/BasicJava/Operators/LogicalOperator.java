package BasicJava.Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int i=19;int j=17; int k=16;
        // && logical AND :- return  true .when both condition are true
        System.out.println("&& logical AND "+(i>j && k<j));

        // || logical or :- return true . when attlist one condition is true
        System.out.println("|| logical Or "+( i>j || k>j));

        // ! Logical NoT :- return false when condition is true
        System.out.println("&& logical AND "+(i !=k));
    }
}
                /* OutPut

                && logical AND true
                || logical Or true
                && logical AND true*/
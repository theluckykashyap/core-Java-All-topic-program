package FlowControl;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if (i==4){
                break;}
            System.out.println("example of break : " +i);
        }
    }
}
/* output
example of break : 0
example of break : 1
example of break : 2
example of break : 3
*/
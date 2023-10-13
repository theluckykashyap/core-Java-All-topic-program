package FlowControl;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if (i==4 || i==8){
            continue;}
            System.out.println("example of Continue : " +i);
        }
    }
}
/*output
example of Continue : 0
example of Continue : 1
example of Continue : 2
example of Continue : 3
example of Continue : 5
example of Continue : 6
example of Continue : 7
example of Continue : 9
example of Continue : 10*/
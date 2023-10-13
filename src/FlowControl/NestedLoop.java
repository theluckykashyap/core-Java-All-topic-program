package FlowControl;

public class NestedLoop {
    public static void main(String[] args) {
        // using nested Loop we are create a pattern
        System.out.println("this is a pattern");
        for (int i=1;i<=10;i++){
            for (int k=0;k<=10;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
/*
 this is a pattern
 ***********
 ***********
 ***********
 ***********
 ***********
 ***********
 ***********
 ***********
 ***********
 ***********
 * */

package FlowControl;

public class ForEachLoop {
    public static void main(String[] args) {
        int ar[] = { 10, 50, 60, 80, 90 };

        for (int num:ar
             ) {
            System.out.println("its is for each loop : "+num);
        }
    }
}
/*output
 its is for each loop : 10
its is for each loop : 50
its is for each loop : 60
its is for each loop : 80
its is for each loop : 90*/
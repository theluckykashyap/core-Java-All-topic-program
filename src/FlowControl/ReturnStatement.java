package FlowControl;

public class ReturnStatement {
   public static int getSum(int a,int b){
       int sum=a+b;
       return sum;

   }

    public static void main(String[] args) {
      int num  =ReturnStatement.getSum(12,12);
        System.out.println("return value of two number "+num);
   }
}
/*output
return value of two number 24*/
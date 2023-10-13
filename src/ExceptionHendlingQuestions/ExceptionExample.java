package ExceptionHendlingQuestions;

public class ExceptionExample {

  static   void divide(int a,int b){
      try {
          a = a / b;
          System.out.println(a);
      }catch (ArithmeticException e) {
          System.out.println(e.getMessage());

      }// using finally block after catch block .finally block always execute
  finally {
          System.out.println("value of a variable : "+a);
          System.out.println("value of b variable : "+b);
      }
  }
    public static void main(String[] args) {
        divide(5,0);
    }
}

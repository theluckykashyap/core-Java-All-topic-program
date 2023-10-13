package ExceptionHendlingQuestions;

 class ThrowsExample {
//We use the throws keyword in the method declaration to declare the type of
// exceptions that might occur within it.
     public static void main(String[] args) throws ArithmeticException {

         int x=0;int y=12;

         int v=y/x;
         System.out.println("result  : "+v);
     }

}

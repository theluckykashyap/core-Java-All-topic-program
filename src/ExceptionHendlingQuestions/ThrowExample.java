package ExceptionHendlingQuestions;

public class ThrowExample {
    // when explicitly throw exceptions in my code .then we can use throw keyword occur
    // the exceptions .it is a single line code & we can use try catch block .
    static void throwExample() {
        int x = 10;
        int y = 0;
        try {
            if (y != 0) {
                int div;
                div = x / y;
                System.out.println("result :" + div);
            } else throw new ArithmeticException("variable can't divided by  :" + y);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        throwExample();
    }
}

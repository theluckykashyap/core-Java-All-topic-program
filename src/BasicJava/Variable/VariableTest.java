package BasicJava.Variable;

public class VariableTest {
    int num = 19; // it is a instance Variable .instance variable access all class
    static int number = 20;// it is a static Variable .it can be called without creating object of class.

    // this is method
    void getNumber(int num) {// it is parameter variable

        String name = "kashyap"; // it is a Local variable
        // local variable can't be access out side of a method.

    }

    void getName() {
        String name = "kashyap";
        System.out.println(name);
    }


    public static void main(String[] args) {
        int num = 30;
// celling static variable without object
        System.out.println(VariableTest.number);

        // calling instance variable .we need to create an object of a class
        VariableTest variableTest = new VariableTest();
        System.out.println(variableTest.num);

        // calling local variable .with the help of method .
        variableTest.getName();
    }
}
 /* Output
       20
               19
               kashyap
               */

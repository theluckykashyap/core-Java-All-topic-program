package BasicJava.Operators;

public class BitwiseOperator {
    public static void main(String[] args) {

        int d = 0b1010;
        int e = 0b1100;
        //BitwiseOperator d & e
        System.out.println("d & e: " + (d & e));
        //BitwiseOperator d | e
        System.out.println("d | e: " + (d | e));
        //BitwiseOperator d ^ e
        System.out.println("d ^ e: " + (d ^ e));
        //BitwiseOperator ~d
        System.out.println("~d: " + (~d));
        //BitwiseOperator d << 2
        System.out.println("d << 2: " + (d << 2));
        //BitwiseOperator e >>1
        System.out.println("e >> 1: " + (e >> 1));
        //BitwiseOperator e >>>1
        System.out.println("e >>> 1: " + (e >>> 1));
    }
}

  /*      Output
          d & e: 8
          d | e: 14
          d ^ e: 6
          ~d: -11
          d << 2: 40
          e >> 1: 6
          e >>> 1: 6*/

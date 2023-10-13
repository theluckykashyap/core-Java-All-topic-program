package BasicJava.Wrapper;
import java.io.*;
public class WrapperClasses {
    public static void main(String[] args) {
          // byte data type
        byte a = 1;

        // wrapping around Byte object
        Byte byteobj =a;

        // int data type
        int b = 10;

        // wrapping around Integer object
        Integer intobj = b;

        // float data type
        float c = 18.6f;

        // wrapping around Float object
        Float floatobj = c;

        // double data type

     double d=12.32;
        // Wrapping around Double object
        Double doubleobj = d ;

        // char data type
        char e = 'a';

        // wrapping around Character object
        Character charobj = e;

        // printing the values from objects
        System.out.println(
                "Values of Wrapper objects (printing as objects)");
        System.out.println("\nByte object byteobj: "
                + byteobj);
        System.out.println("\nInteger object intobj: "
                + intobj);
        System.out.println("\nFloat object floatobj: "
                + floatobj);
        System.out.println("\nDouble object doubleobj: "
                + doubleobj);
        System.out.println("\nCharacter object charobj: "
                + charobj);

        // objects to data types (retrieving data types from
        // objects) unwrapping objects to primitive data
        // types
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        // printing the values from data types
        System.out.println("\nUnwrapped values (printing as data types)");
        System.out.println("\nbyte value, bv: " + bv);
        System.out.println("\nint value, iv: " + iv);
        System.out.println("\nfloat value, fv: " + fv);
        System.out.println("\ndouble value, dv: " + dv);
        System.out.println("\nchar value, cv: " + cv);
    }
}/* output
    Values of Wrapper objects (printing as objects)

    Byte object byteobj: 1

        Integer object intobj: 10

        Float object floatobj: 18.6

        Double object doubleobj: 12.32

        Character object charobj: a

        Unwrapped values (printing as data types)

        byte value, bv: 1

        int value, iv: 10

        float value, fv: 18.6

        double value, dv: 12.32

        char value, cv: a*/
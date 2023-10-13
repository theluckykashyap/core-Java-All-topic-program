package BasicJava;

public class ObjectProgram {
    /*what is an object?
    object is a real world entity .or evey one is an object . like person is an object ,
    object represent the instance of a class;
    * */
    int a =10;

    int b =20;
    int c =a+b;
    public static void main(String[] args) {
        // object creating
        ObjectProgram objectProgram= new ObjectProgram();
        System.out.println(objectProgram.c);
    }
}

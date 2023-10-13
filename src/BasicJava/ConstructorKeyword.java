package BasicJava;

public class ConstructorKeyword {
    /*
    * constructor is a same name as a class name it is called automatically when
    * object is created .
    * it might be 4 types of constructor
    * 1. default constructor : it is automatically called if my class don't have constructor
    * compiler created this Constructor
    * 2.private Constructor : it is a created by the programmer.its help to create
    * a singleton class .because that time have only one object.
    * 3.  */

    ConstructorKeyword(){
        super();
    }
    
    ConstructorKeyword(int x){

    }
    public static void main(String[] args) {
        ConstructorKeyword constructorKeyword =new ConstructorKeyword();

    }
}

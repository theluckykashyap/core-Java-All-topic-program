package BasicJava;

public class SuperKeyword {

    // super keyword is used to if we need to called parent class method .
    void Super(){
        System.out.println("it is my parent class");
    }

    public static void main(String[] args) {
              SuperChild child=new SuperChild();
              // super called here
              child.Super();
              child.SuperChild();

    }

}
class SuperChild extends SuperKeyword{
void SuperChild(){
    System.out.println("it is child class");
    super.Super();
}

}

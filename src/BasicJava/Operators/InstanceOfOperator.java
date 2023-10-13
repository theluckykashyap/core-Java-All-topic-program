package BasicJava.Operators;

public class InstanceOfOperator {
    public static void main(String[] args) {
         Person obj1= new Person();
         Person obj2= new Child();
        System.out.println("obj1 instanceOf Person : " +(obj1 instanceof Person));
        System.out.println("obj2 instanceOf Child : " +(obj2 instanceof Child));
        System.out.println("obj1 instanceOf interface Test : " +(obj1 instanceof Test));
    }
}
class Person{

}
class Child extends Person implements Test{

}
interface Test {

}

   /* output
   obj1 instanceOf Person : true
        obj2 instanceOf Child : true
        obj1 instanceOf interface Test : false*/

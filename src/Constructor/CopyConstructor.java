package Constructor;

public class CopyConstructor {
   private int id;
   private String name;
   //parameterized Constructor
   CopyConstructor(int id,String name){
       System.out.println("it is a parameterized Constructor");
       this.id=id;
       this.name=name;

   }
   //CopyConstructor
    CopyConstructor(CopyConstructor obj){
        System.out.println(" it is a CopyConstructor");
       obj.name=name;
       obj.id=id;

    }
    public static void main(String[] args) {
        CopyConstructor constructor= new CopyConstructor(102,"Lucky");
        CopyConstructor constructor1= new CopyConstructor(constructor);

       CopyConstructor  constructor2=constructor1;
        System.out.println(constructor1);
        System.out.println(constructor2);
   }
}

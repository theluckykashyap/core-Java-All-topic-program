package BasicJava;

public class ThisKeyword {
   // this keyword used to refer to current instance  of a class.and it is used to constructor and method
   int a;int b;
    void thisKey(int a ,int b){
        // here we are using this keyword
       this.a=a;
       this.b=b;
        System.out.println(a+b);
   }
    public static void main(String[] args) {
       ThisKeyword thisKeyword=new ThisKeyword();
       thisKeyword.thisKey(13,15);
   }
}

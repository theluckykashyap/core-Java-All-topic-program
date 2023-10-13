package Constructor;

public class ParameterizedConstructor {
   private long phoneNumber;
   private String name;

    ParameterizedConstructor(long phoneNumber,String name){
        this.phoneNumber=phoneNumber;
        this.name=name;

    }
    public static void main(String[] args) {
        ParameterizedConstructor constructor = new ParameterizedConstructor(10710,"Lucky");
        System.out.println( constructor.name);
        System.out.println(constructor.phoneNumber);
    }
}

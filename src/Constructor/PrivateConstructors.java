package Constructor;

public class PrivateConstructors {
    static PrivateConstructors instance=null;
    public int x = 10;
    private PrivateConstructors(){
        System.out.println("PrivateConstructors");
    }
    static public PrivateConstructors getInstance()
    {
        if (instance == null)
            instance = new PrivateConstructors();

        return instance;
    }
    public static void main(String[] args) {
     PrivateConstructors a=PrivateConstructors.getInstance();
     PrivateConstructors b=PrivateConstructors.getInstance();

        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
}

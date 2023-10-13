package Interfaces;

public interface Interface {// its is an interface
    void getname();
}
class main implements Interface{

    @Override
    public void getname() {
        System.out.println("Lucky Kashayp ");
    }

    public static void main(String[] args) {
        main main= new main();
        main.getname();
    }
}
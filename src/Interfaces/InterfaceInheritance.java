package Interfaces;

public interface InterfaceInheritance {
    void getName();
    void getId();
}
 interface InterfaceInheritance1 {
    void getPhoneNumber();
    void getCity();
}
class Main1 implements InterfaceInheritance,InterfaceInheritance1 {



        @Override
        public void getName () {
            System.out.println("Lucky Kashyap");

        }

        @Override
        public void getId () {
            System.out.println("101");

        }

        @Override
        public void getPhoneNumber () {
            System.out.println("8859610710");

        }

        @Override
        public void getCity () {
            System.out.println("Haridwar");

        }
    public static void main(String[] args) {
        Main1 main2 = new Main1();
        main2.getCity();
        main2.getId();
        main2.getName();
        main2.getPhoneNumber();

    }
}
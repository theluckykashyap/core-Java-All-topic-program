package CollectionsFramework.Set;


import java.util.EnumSet;

enum number {one,day,name,school,city};
public class TestEnumSet {
    public static void main(String[] args) {
        EnumSet<number> numbers,numbers1;
        numbers=EnumSet.allOf(number.class);
        System.out.println(numbers);
        numbers1= EnumSet.complementOf(numbers);
        System.out.println(numbers1);

    }
}

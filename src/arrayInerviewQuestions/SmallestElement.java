package arrayInerviewQuestions;

public class SmallestElement {
    public static void main(String[] args) {
        int [] number={123,453,76,876,35,876,335,34,467,};
        int SmallestElement =number[0];
        for (int i=0;i<number.length;i++){
            if(SmallestElement>=number[i]){
                SmallestElement=number[i];
            }
        }
        System.out.println(SmallestElement);
    }
}

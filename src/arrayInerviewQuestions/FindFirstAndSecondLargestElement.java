package arrayInerviewQuestions;

public class FindFirstAndSecondLargestElement {
    public static void main(String[] args) {
        int [] arr1 = {0,32,56,567,4567,81,0,17,18,56};
        int first=0;
        int second=0;
        for (int i=0;i< arr1.length;i++){
            if (first<arr1[i]){
                second=first;
                first=arr1[i];

            }else if (second<arr1[i]){
                second=arr1[i];
            }
        }
        System.out.println(first+"-----"+second);
    }
}

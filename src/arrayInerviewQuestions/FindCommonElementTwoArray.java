package arrayInerviewQuestions;

public class FindCommonElementTwoArray {
    public static void main(String[] args) {
        int [] arr2 = {0,32,56,567,4567,87,23,87,98,56};
        int [] arr1 = {0,32,56,567,4567,81,2,17,18,46};
        // using  nested loop
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j< arr1.length;j++){
                if (arr2[i]==arr1[j]){
                    System.out.println(arr1[j]);
                }
            }
        }
    }
}

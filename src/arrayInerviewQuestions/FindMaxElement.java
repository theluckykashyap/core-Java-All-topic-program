package arrayInerviewQuestions;

public class FindMaxElement {
    public static void main(String[] args) {
        int arr1 [] ={123,34,45,768,65,45,345,};
        int max=arr1[0];
        for (int i=0;i< arr1.length;i++){
           if (max<arr1[i]){
               max=arr1[i];
           }
        }
        System.out.println(max);
    }



}

package arrayInerviewQuestions;

public class FindMaxAndMinElement {
    public static void main(String[] args) {
        int [] arr2 = {0,32,56,567,4567,87,23,87,98,56};
        int max=arr2[0];
        System.out.println(arr2[0]);
        int min=arr2[0];
        for (int i=0;i< arr2.length;i++){
            if(max<arr2[i]){
                max = arr2[i];
           }else if(min > arr2[i]){
               min=arr2[i];
            }
        }
        System.out.println("Array max element : "+max+", Array min element :"+min);
    }
}

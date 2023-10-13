package arrayInerviewQuestions;

import java.util.Arrays;

public class HistogramPattern {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 3, 8};
        printHistogramPattern(array);

        int[] arr = { 10, 9, 12, 4, 5, 2, 8, 5, 3, 1 };
        int n = arr.length;
        printHistogram(arr, n);
        System.out.println();
        printHisto(arr);
    }

    public static void printHistogramPattern(int[] array) {
        int maxFrequency = 0;

        // Find the maximum frequency in the array
        for (int num : array) {
            if (num > maxFrequency) {
                maxFrequency = num;
            }
        }

        // Print the histogram pattern
        for (int i = maxFrequency; i > 0; i--) {
            for (int num : array) {
                if (num >= i) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    static void printHistogram(int[] arr, int n) {
        int maxEle = Arrays.stream(arr).max().getAsInt();
        for (int i = maxEle; i >= 0; i--) {
            System.out.format("%2d | ", i);
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n + 3; i++) {
            System.out.print("---");
        }

        System.out.println();
        System.out.print("     ");

        for (int i = 0; i < n; i++) {
            System.out.format("%2d ", arr[i]);
        }
    }

    public static  void printHisto(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int n=arr[i];
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            for(int k=0;k<arr.length-n-1;k++){
                System.out.print("_");
            }
            System.out.println();
        }
    }
}


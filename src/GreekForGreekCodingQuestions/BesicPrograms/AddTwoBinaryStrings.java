package GreekForGreekCodingQuestions.BesicPrograms;

public class AddTwoBinaryStrings {
   static String Add_Binary(String a,String b){
  // converting binary string into integer
       int num= Integer.parseInt(a,2);

       int num1 =Integer.parseInt(b,2);
// sum of two integer number
       int sum= num1+num;
                     // converting integer number into binary String
       String result= Integer.toBinaryString(sum);
       return result;

   }

    public static void main(String[] args) {
        String a = "011011", b = "1010111";
        System.out.println("---------------"+Add_Binary(a,b));
    }
}

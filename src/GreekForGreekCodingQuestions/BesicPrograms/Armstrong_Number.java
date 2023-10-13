package GreekForGreekCodingQuestions.BesicPrograms;

public class Armstrong_Number {

      static boolean Armstrong_Num(int num){
          int temp=num;
          int n=0;
          if (num>0){
          int res=num%10;
           n=(res*res*res)+n;
           num=num/num;

          }
          if (temp==n)return true;
          else return false;
      }
    public static void main(String[] args) {

          int a=370;
          Armstrong_Num(a);
         if ( Armstrong_Num(a)==false){
             System.out.println("number is Armstrong ");
         }else System.out.println("number is not Armstrong");

    }
}

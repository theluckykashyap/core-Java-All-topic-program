package GreekForGreekCodingQuestions.BesicPrograms;

public class Find_LCM {
    int result =0;
    public int find_Lcm(int num1,int num2){
        int res= (num1 > num2) ? num1 :num2 ;
        while (true){
            if (res %num1==0 && res % num2==0)
                break;
            res++;

        }
 return res;
    }
    public static void main(String[] args) {
       int num1=15; int num2=25;
       Find_LCM findLcm= new Find_LCM();
       int lcm=findLcm.find_Lcm(num1,num2);
        System.out.println("num1 : "+num1+" num2 : "+num2+"LCM is : "+lcm);

    }
}

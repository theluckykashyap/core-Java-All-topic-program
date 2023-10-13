package Input_Output;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedOutPut {
    public static void main(String[] args) {
        int y =100;
        double num= 675.342;
        int date= 25-07-2002;
        // using printf Format
        System.out.printf("it is a number y= %d\n",y);

        // using DecimalFormat
        DecimalFormat decimalFormat = new DecimalFormat("####.#");
        System.out.println(decimalFormat.format(num));
        DecimalFormat decimalFormat1 = new DecimalFormat("####.##");
        System.out.println(decimalFormat1.format(num));
        DecimalFormat decimalFormat2 = new DecimalFormat("$####.###");
        System.out.println(decimalFormat2.format(num));
        //simpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(date));
    }
}

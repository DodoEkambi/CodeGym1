package task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        String sNumber4 = reader.readLine();
        int number1 = Integer.parseInt(sNumber1);
        int number2 = Integer.parseInt(sNumber2);
        int number3 = Integer.parseInt(sNumber3);
        int number4 = Integer.parseInt(sNumber4);
        int max = number1 ;
        if(max<number2)
        {
            max = number2;
        }
        if (max<number3)
        {
            max = number3;
        }
        if(max<number4)
        {
            max= number4;
        }

            System.out.println(max);

    }
}

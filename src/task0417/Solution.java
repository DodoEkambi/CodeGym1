package task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        int number1 = Integer.parseInt(sNumber1);
        int number2 = Integer.parseInt(sNumber2);
        int number3 = Integer.parseInt(sNumber3);
        if(number1 == number2)
        {
            if(number1 == number3)
            {
                System.out.println(number1 + " " + number2 + " " + number3);
            }
            else
            {
                System.out.println(number1 + " " + number2);
            }
        }
        else if(number1 == number3)
        {
            System.out.println(number1 + " " + number3);
        }
        else if(number2 == number3)
        {
            System.out.println(number2 +" "+number3);
        }
    }
}

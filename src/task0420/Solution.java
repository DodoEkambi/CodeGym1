package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 =  Integer.parseInt(reader.readLine());
        int number2 =  Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int min, mean, max;
        if(number1>number2)
        {
            if(number1>number3)
            {
                if(number2>number3)
                {
                  min = number3;
                  mean = number2;
                  max = number1;
                }
                else
                {
                    min = number2;
                    mean = number3;
                    max = number1;
                }
            }
            else
            {
                min = number2;
                mean = number1;
                max = number3;
            }
            System.out.println(max + " " + mean + " " + min);
        }
        else if(number2>number3)
            if (number1 < number3) {
                min = number1;
                mean = number3;
                max = number2;
                System.out.println(max + " " + mean + " " + min);
            } else {
                min = number3;
                mean = number1;
                max = number2;
                System.out.println(max + " " + mean + " " + min);
            }
        else
        {
            min = number1;
            mean = number2;
            max = number3;
            System.out.println(max + " " + mean + " " + min);
        }

    }
}

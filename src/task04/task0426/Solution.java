package task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        if(num1 == 0)
        {
            System.out.println("Zero");
        }
        else if(num1 < 0)
        {
            if (num1 % 2 == 0)
            {
            System.out.println("Negative even number");
            }
            else
                System.out.println("Negative odd number");
        }
        else {
            if(num1 % 2 == 0 )
            {
                System.out.println("Positive even number");
            }
            else
                System.out.println("Positive odd number");
        }
    }
}

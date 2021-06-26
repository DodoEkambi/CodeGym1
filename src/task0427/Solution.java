package task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        if(num1>0 && num1<10)
        {
            if(num1%2==0)
            {
                System.out.println("even single-digit number");
            }
            else
                System.out.println("odd single-digit number");
        }
        else if(num1>=10 && num1<100)
        {
            if(num1%2==0)
            {
                System.out.println("even two-digit number");
            }
            else
                System.out.println("odd two-digit number");
        }
        else if(num1>=100 && num1<=999)
        {
            if(num1%2==0)
            {
                System.out.println("even three-digit number");
            }
            else
                System.out.println("odd three-digit number");
        }
    }
}

package task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        if (num1 > 0 && num2 > 0)
        {
            System.out.println("1");
        }
        else if (num1 < 0 && num2 > 0)
        {
            System.out.println("2");
        }
        else if (num1 < 0 && num2 < 0)
        {
            System.out.println("3");
        }
        else if (num1 >0 && num2 <0)
        {
            System.out.println("4");
        }
    }
}

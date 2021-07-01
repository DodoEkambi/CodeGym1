package task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        if((num3 >= num1 && num1 >= num2) || (num2 >= num1 && num1 >= num3))
        {
            System.out.println(num1);
        }
        else if((num3 >= num2 && num2 >= num1) || (num1 >= num2 && num2 >= num3))
        {
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }

    }
}

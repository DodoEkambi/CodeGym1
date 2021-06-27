package task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count1 = 0;
        int count2 = 0;
        int num1 = Integer.parseInt(bufferedReader.readLine());
        if(num1<0)
        {
            count2++;
        }
        else if(num1>0)
        {
            count1++;
        }
        int num2 = Integer.parseInt(bufferedReader.readLine());
        if(num2<0)
        {
            count2++;
        }
        else if(num2>0)
        {
            count1++;
        }
        int num3 = Integer.parseInt(bufferedReader.readLine());
        if(num3<0)
        {
            count2++;
        }
        else if(num3>0)
        {
            count1++;
        }
        System.out.println("Number of negative numbers: " + count2);
        System.out.println("Number of positive numbers: " + count1);
    }
}

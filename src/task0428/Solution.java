package task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        if(num1>0)
        {
            count++;
        }
        int num2 = Integer.parseInt(bufferedReader.readLine());
        if(num2>0)
        {
            count++;
        }
        int num3 = Integer.parseInt(bufferedReader.readLine());
        if(num3>0)
        {
            count++;
        }
        System.out.println(count);
    }
}

package task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        int number1 = Integer.parseInt(sNumber1);
        int number2 = Integer.parseInt(sNumber2);
        if(number1 < number2)
        {
            System.out.println(number1);
        }
        else System.out.println(number2);
    }
}

package task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        double number = Double.parseDouble(sNumber);
        double remain= number%5.0;
        if(remain<3.0)
        {
            System.out.println("green");
        }
        else if (remain>=3.0 && remain<4.0)
        {
            System.out.println("yellow");
        }
        else
            System.out.println("red");
    }
}

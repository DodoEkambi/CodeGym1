package task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());
        for(int i=m;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

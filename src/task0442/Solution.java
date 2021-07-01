package task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true)
        {

            int num = Integer.parseInt(bufferedReader.readLine());

            if(num == -1)
            {
                System.out.println(sum-1);
                break;
            }
            else
            {
                sum += num;
            }
        }
    }
}

package task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int n = Integer.parseInt(bufferedReader.readLine());
        while(n>0)
        {
            System.out.println(s);
            n--;
        }
    }
}

package task04.task0439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        for(int i = 1 ; i<=10;i++)
        {
            System.out.println(name + " loves me.");
        }
    }
}

package task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int year = Integer.parseInt(bufferedReader.readLine());
        int month = Integer.parseInt(bufferedReader.readLine());
        int day = Integer.parseInt(bufferedReader.readLine());
        System.out.println("My name is " + name +".");
        System.out.println("I was born in " + month + "/" + day + "/" + year);
    }
}

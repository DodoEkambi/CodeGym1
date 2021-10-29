package task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        int e = Integer.parseInt(bufferedReader.readLine());

        int minimum = min(a, b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c , int d, int e) {
        return (((a < b ? a : b )<c?(a < b ? a : b ):c)<d?((a < b ? a : b )<c?(a < b ? a : b ):c):d)<e?(((a < b ? a : b )<c?(a < b ? a : b ):c)<d?((a < b ? a : b )<c?(a < b ? a : b ):c):d):e;
    }
   /* public static int min(int a, int b, int c, int d,int e){
        return Math.min((Math.min(Math.min(a, b), Math.min(c,d))), e);
    }*/
}

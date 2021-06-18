package task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String snumber1 = reader.readLine();
        //String snumber2 = reader.readLine();
        int number1 = Integer.parseInt(snumber1);
        //Int number2 = Integer.parseInt(snumber2);
        if(number1>0){
            number1=2*number1;
            System.out.println(number1);
        }
        else if(number1<0){
            number1++;
            System.out.println(number1);
        }
        else {
            System.out.println(number1);
        }
    }
}

package task07.task0703;
/*
1. Create an array of 10 strings.
2. Create an array of 10 numbers.
3. Enter 10 strings from the keyboard, and put them in an array of strings.
4. In each element of the number array, record the length of the string whose string array index coincides with the current index of the number array.

Display the contents of the number array, each value on a new line.

Requirements:
•	The program must create an array of 10 strings.
•	The program must create an array of 10 integers.
•	The program should read strings for the array from the keyboard.
•	The program must record the lengths of the strings in the number array, and then display them on the screen.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sArray = new String[10];
        int[] nArray= new int[10];
        for(int i = 0; i< sArray.length ; i++){
            sArray[i] = reader.readLine();
            }
        for(int j = 0; j< nArray.length ;j++){
            nArray[j] = sArray[j].length();
            System.out.println(nArray[j]);
        }

    }
}

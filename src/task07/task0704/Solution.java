package task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1. Create an array of 10 numbers.
2. Enter 10 numbers from the keyboard and write them to the array.
3. Display the elements of the array in reverse order. Display each value on a new line.

Requirements:
•	The program must create an array of 10 integers.
•	The program should read numbers for the array from the keyboard.
•	The program should display 10 values, each on a new line.
•	The array must be displayed in reverse order.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nArray = new int[10];
        for(int i = 0; i< nArray.length ; i++){
            nArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 9 ; j>=0 ; j--){
            System.out.println(nArray[j]);
        }
    }
}

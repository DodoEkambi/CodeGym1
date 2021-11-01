package task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1. Create an array of 15 integers.
2. Populate it with values ​​from the keyboard.
3. Let the array index represent the house number. The array value at a particular index represents the number of people living in the corresponding house.
Houses with odd numbers are located on one side of the street. Those with even numbers are on the other side. Find out which side of the street has more people living on it.
4. Display the following message: "Odd-numbered houses have more residents." or "Even-numbered houses have more residents."

Note:
The house at index 0 is considered even.

5. If the number of residents on each side of the street is the same, then output nothing.

Requirements:
•	The program must create an array of 15 integers.
•	The program should read numbers for the array from the keyboard.
•	The program should display "Odd-numbered houses have more residents." if the sum of odd array elements is greater than the sum of even ones.
•	The program should display "Even-numbered houses have more residents." if the sum of even array elements is greater than the sum of odd ones.
•	The program should not output text to the console if the number of residents on each side is the same.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < 15; j++) {

            if (j % 2 == 0) {
                even += array[j];
            } else {
                odd += array[j];
            }
          }
        if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}

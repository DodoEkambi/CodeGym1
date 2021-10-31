package task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Task: Write a program that reads 5 numbers from the keyboard and displays them in ascending order.

Example input:
3
2
15
6
17

Example output:
2
3
6
15
17

Requirements:
•	The program should read 5 numbers from the keyboard.
•	The program should display 5 numbers, each on a new line.
•	The output must contain the same numbers that were entered (order is not important).
•	The displayed numbers should be sorted in ascending order.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int[] array = new int[]{a, b, c, d, e};
        sort(array);

        for (int x : array) {

        System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}

/*
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

//        int tmp;
//        for(int j=4; j>0; j--)
//            for (int i = 0; i < j; i++)
//            {
//                if (nums[i] > nums[i + 1]) {
//                    tmp = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = tmp;
//                }
//            }

        int tmp;
        for(int i = 0; i<nums.length; i++)
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }


        for(int i = 0; i<5; i++){
            System.out.println(nums[i]);
        }
    }
}
 */

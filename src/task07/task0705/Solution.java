package task07.task0705;
/*
1. Create an array of 20 numbers.
2. Populate it with values ​​from the keyboard.
3. Create two arrays of 10 numbers each.
4. Copy the large array into the two small ones: half the numbers into the first small array, and the second half into the second small array.
5. Display the second small array, each value on a new line.

Requirements:
•	The program must create an array of 20 integers.
•	The program should read 20 numbers from the keyboard for the large array.
•	The program must create two small arrays of 10 numbers each.
•	The program must copy one half of the large array into the first small array, copy the second half into the second array, and then display that array on the screen.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] fArray = new int[20];
        for(int i = 0; i<fArray.length;i++){
            fArray[i] = Integer.parseInt(reader.readLine());
        }
        int[] sArray = new int[10];
        for(int j =0; j< sArray.length;j++){
            sArray[j] = fArray[j];
        }
        int[] tArray = new int[10];
        for(int k = 0; k< tArray.length;k++){
            int a=k+10;
            tArray[k] = fArray[a];
        }
      /*  for(int i=0;i< sArray.length;i++){
            System.out.println(sArray[i]);
        }*/
        for(int j=0;j<tArray.length;j++){
            System.out.println(tArray[j]);
        }

    }
}

/*
package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;


One large array and two small ones



public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(bis.readLine());
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }

    }
}

 */

package task07.task0701;
/*
1. In the initializeArray() method:
1.1. Create an array of 20 numbers
1.2. Read 20 numbers from the console and put them into the array
2. The max(int[] array) method must find the maximum of the array elements

Requirements:
The initializeArray method must create an array of 20 integers.
The initializeArray method must read in 20 numbers and return them as an array.
The max method must return the maximum element in the passed array.
Don't change the main method.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for(int i = 0;  i<list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max=0;
        for(int j=0;j<array.length;j++){
            if(max<array[j]){
                max=array[j];
            }
        }
        return max;
    }
}
/*
package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


Maximum in an array



public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();

        int max = max(array);

        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(bis.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

 */
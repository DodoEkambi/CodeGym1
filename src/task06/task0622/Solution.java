package task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Task: Each cat has a name and a mother.
Create a class that describes this situation.
Create two objects: a daughter cat and a mother.
Display them on the screen.

New task: Each cat has a name, a father, and a mother.
Edit Cat so that it reflects these relationships.
Create 6 objects: grandfather (the father's father), grandmother (the mother's mother), father, mother, son, daughter.
Display them all in the following order: grandfather, grandmother, father, mother, son, daughter.

Example input:
Grandfather Tiger
Grandmother Puss
Father Oscar
Mother Missy
Son Simba
Daughter Coco

Example output:
The cat's name is Grandfather Tiger, no mother, no father
The cat's name is Grandmother Puss, no mother, no father
The cat's name is Father Oscar, no mother, Grandfather Tiger is the father
The cat's name is Mother Missy, Grandmother Puss is the mother, no father
The cat's name is Son Simba, Mother Missy is the mother, Father Oscar is the father
The cat's name is Daughter Coco, Mother Missy is the mother, Father Oscar is the father

Requirements:
•	The program should read in the names of 6 cats in the specified order.
•	The main method should create 6 Cat objects.
•	The program should display 6 lines with information about the cats.
•	The line about the grandfather (first line) must match the conditions.
•	The line about the grandmother (second line) must match the conditions.
•	The line about the father (third line) must match the conditions.
•	The line about the mother (fourth line) must match the conditions.
•	The line about the son (fifth line) must match the conditions.
•	The line about the daughter (sixth line) must match the conditions.
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

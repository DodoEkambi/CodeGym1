package task0433;

public class Solution {
    public static void main(String[] args) {
        int count1 = 10;

        while(count1>0)
        {
            int count2 = 10;
            while(count2>0)
            {
                System.out.print("$");
                count2--;
            }
            System.out.println();
            count1--;
        }
    }
}

package task0434;

public class Solution {
    public static void main(String[] args) {
        int count1 = 10;
        int count3=1;
        while(count1>0)
        {
            int count2 = 10;
            int count4=1;
            while(count2>0)
            {
                System.out.print((count3*count4)+ " ");
                count4++;
                count2--;
            }
            count3++;
            System.out.println();
            count1--;
        }
    }
}

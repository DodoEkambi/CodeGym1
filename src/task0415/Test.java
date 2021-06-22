package task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String sSide1 = reader.readLine();
        String sSide2 = reader.readLine();
        String sSide3 = reader.readLine();
        int side1 = Integer.parseInt(sSide1);
        int side2 = Integer.parseInt(sSide2);
        int side3 = Integer.parseInt(sSide3);
        if(side1 < (side2+side3))
        {
            if(side2 < (side1+side3))
            {
                if(side3 < (side1+side2))
                {
                    System.out.println("The triangle is possible.");
                }
                else
                {
                    System.out.println("The triangle is not possible.");
                }
            }
            else
            {
                System.out.println("The triangle is not possible.");
            }

        }
        else
        {
            System.out.println("The triangle is not possible.");
        }
    }
}

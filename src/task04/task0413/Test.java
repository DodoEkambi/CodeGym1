package task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nday = reader.readLine();
        int numday = Integer.parseInt(nday);
        if (numday == 1)
        {
            System.out.println("Monday");
        }
        else if(numday ==2)
        {
            System.out.println("Tuesday");
        }
        else if(numday ==3)
        {
            System.out.println("Wednesday");
        }
        else if(numday ==4)
        {
            System.out.println("Thursday");
        }
        else if(numday ==5)
        {
            System.out.println("Friday");
        }
        else if(numday ==6)
        {
            System.out.println("Saturday");
        }
        else if(numday ==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("No such day of the week");
        }
    }
}

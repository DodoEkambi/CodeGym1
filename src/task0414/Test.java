package task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dayNumber = reader.readLine();
        int numberDay = Integer.parseInt(dayNumber);
        if (numberDay < 100) {
            if (numberDay % 4 == 0) {
                System.out.println("Number of days in the year: 366");
            } else {
                System.out.println("Number of days in the year: 365");
            }
        } else if (numberDay >= 100) {
            if (numberDay % 4 == 0) {
                if (numberDay % 400 == 0) {
                    if (numberDay % 100 == 0) {
                        System.out.println("Number of days in the year: 365");
                    } else {
                        System.out.println("Number of days in the year: 366");
                    }
                }
            }
        } else {
            System.out.println("Number of days in the year: 365");
        }
    }
}



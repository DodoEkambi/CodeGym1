package task06.task060502;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
                double BMI = weight/(height*height);
                if(BMI<18.5){
                    System.out.println("Underweight: BMI < 18.5");
                }
                else if(BMI>=18.5&&BMI<25){
                    System.out.println("Normal: 18.5 <= BMI < 25");
                }
                else if(BMI>=25&&BMI<30){
                    System.out.println("Overweight: 25 <= BMI < 30");
                }
                else if(BMI>=30){
                    System.out.println("Obese: BMI >= 30");
                }
        }
    }
}

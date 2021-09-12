package task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int counter=0;
        double sum=0;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    while (true){

        double number = Double.parseDouble(bufferedReader.readLine());
        if (number==-1){
            if(counter==0){
                System.out.println(0.0);
                break;
            }
            else{
            double avg=(sum/counter);
            System.out.println(avg);
            break;
            }
        }
        else
            counter++;
            sum += number;
    }
    }

}

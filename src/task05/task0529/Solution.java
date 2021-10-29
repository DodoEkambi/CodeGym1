package task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int toplam = 0;
        while(true){
            String s = bufferedReader.readLine();
            if(s.equals("sum")){

                System.out.println(toplam);
                break;
            }
            else {
                int number = Integer.parseInt(s);
                toplam += number;
            }
        }

    }
}

package task06.task0605;

import java.io.*;

public class Solution {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          int number = Integer.parseInt(bufferedReader.readLine());
          while(true){
              if(number<=0){
                  break;
              }
              else{
                  while(number>0){
                      int lastBit = number%10;
                      number = (number-lastBit)/10;
                      if(lastBit%2==0){
                          even++;
                      }
                      else{
                          odd++;
                      }
                  }
                  System.out.println("Even: " + even + " Odd: " + odd);

              }
          }
    }
}

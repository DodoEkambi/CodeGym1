package task05.task0532;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int count = Integer.parseInt(bufferedReader.readLine());

        while(true) {
            if (count <= 0) {
                break;
            }
            else{
                for (int i = 0; i < count; i++) {
                    int j = Integer.parseInt(bufferedReader.readLine());
                    if (maximum < j) {
                        maximum = j;
                    }
                }
                System.out.println(maximum);
            }
        }
    }
}

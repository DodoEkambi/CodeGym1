package task05.taskForum;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a != b && a != c) {
            if (b == c) {
                System.out.println(1);
            }
        } else if (b != a && b != c) {
            if (a == c) {
                System.out.println("2");
            }
        } else if (c != a && c != b) {
            if (a == b) {
                System.out.println(3);
            }
        }
    }
}

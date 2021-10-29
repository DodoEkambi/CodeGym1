package task06.task0611;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //write your code here
        multiply(s,5);
        return result;
    }

    public static String multiply(String s, int count) {
        StringBuilder result = new StringBuilder();
        /* write your code here */
        result.append(String.valueOf(s).repeat(Math.max(0, count)));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("ab"));
        System.out.println( multiply("ac",3));
    }
}

/* ALTERNATİF ÇÖZÜM
public class StringHelper {
    public static String multiply(String s) {
        return multiply(s, 5);
    }

    public static String multiply(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
 */

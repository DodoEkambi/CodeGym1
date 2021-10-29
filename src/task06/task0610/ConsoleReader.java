package task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {

    public static String readString() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = bufferedReader.readLine();
        return sentence;
    }

    public static int readInt()throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberInteger = Integer.parseInt(bufferedReader.readLine());
        return numberInteger;
    }

    public static double readDouble() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double numberDouble = Double.parseDouble(bufferedReader.readLine());
        return numberDouble;
    }
    public static boolean readBoolean() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = bufferedReader.readLine();
        boolean result=false;
        if(sentence.equals("true")){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {

    }

}

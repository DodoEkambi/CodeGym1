package task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0 ; i<5; i++){
            String s = reader.readLine();
            strings.add(i,s);
        }
        int max=0;

        for(int j=0;j< strings.size();j++){
           int length = strings.get(j).length();
           if(max<=length){
               max= length;
           }
        }
        for(int k=0;k<strings.size();k++){
            if(max==strings.get(k).length()){
                System.out.println(strings.get(k));
            }
        }

    }
}

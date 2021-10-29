package task05.task0528;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy");//ekrana bastırılacak patterni belirttik
        Date date = new Date();//date nesnesini oluşturup bugünü aldık
        System.out.println(formatter.format(date));//date nesnesini ekrana bastırdık. bunun için SimpleDateFormat sınıfının format metodunu kullandık.
    }
}

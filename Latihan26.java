
package Pertemuan5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Latihan26 {
     public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        Date date = new Date();
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}

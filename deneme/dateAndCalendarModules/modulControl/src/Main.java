import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Calendar tarih = new GregorianCalendar();
        System.out.println(tarih.get(Calendar.HOUR_OF_DAY));

    }
}
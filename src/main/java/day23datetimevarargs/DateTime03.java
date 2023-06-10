package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMMM/dd/yyyy hh:mm a");
        String formattedLdt=dtf.format(ldt);
        System.out.println(formattedLdt);
    }
}

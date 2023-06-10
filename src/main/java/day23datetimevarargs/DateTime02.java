package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliris?
        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);//23:02:26.963006100

        //Anlik zamanda bilesenler nasil alinir?
        int hour=myCurrentTime.getHour();
        System.out.println(hour);
        int min=myCurrentTime.getMinute();
        System.out.println(min);
        int second=myCurrentTime.getSecond();
        System.out.println(second);
        int nano=myCurrentTime.getNano();
        System.out.println(nano);
        //Gelecek ve gecmise nasil gidilir?
        LocalTime next=myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        /*
        DateTime class ta kullanilan tarih saat formarlari
        HH:mm ==> 24'lu saat sistemi
        hh:mm ==> 12'li saat sistemi AM,PM gosterilmez
        hh:mm a ==> 12'li saat sistemi AM,PM gosterilir
        HH:mm:ss ==> 24'li saat sistemi
        HH:MM ==> Yanlis format MM aylar icin kullanilir
        "mm" minute demekdir."MM" month demektir.

        dd-MM-yyyy==> gun ay yil
        MMM ==>Aug
        MMMM==>August
         */
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedMyCurrentTime=dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date format nasil degistirilir?
        LocalDate myDate= LocalDate.of(2023,8,13);
        System.out.println(myDate);
        //Tarihi AY/GUN/YIL sekline ceviriniz
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedMyDate=dtf2.format(myDate);
        System.out.println(formattedMyDate);

        //Tarihi Gun/Ay isminin ilk uc harfi/YIL sekline ceviriniz 13/Aug/23
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd-MMM-yy");
        String formattedMyDate2=dtf3.format(myDate);
        System.out.println(formattedMyDate2);
        //Tarih GUN/AYIsmi/YIL sekline ceviriniz 13/August/2023
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyDate3=dtf4.format(myDate);
        System.out.println(formattedMyDate3);

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);
        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);
        LocalTime timeInAmsterdam=LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);
        LocalTime timeInBerlin=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);
    }
}

package day29collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        //Ornek: Ogrenci email adreslerini natural order a gore siralanmis olarak depolayiniz

        long t1=System.nanoTime();

        //1.Yol
        TreeSet<String>emails=new TreeSet<>();
        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]

        long t2=System.nanoTime();

        //2.Yol
        HashSet<String>emailsHs=new HashSet<>();
        emailsHs.add("z@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("k@gmail.com");
        emailsHs.add("v@gmail.com");
        emailsHs.add("h@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("m@gmail.com");
        TreeSet<String>emailsHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);

        long t3=System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}

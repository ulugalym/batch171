package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>();//bu ilk olusturma sekli
        List<String>list2=new ArrayList<>();//data type'ini list secebildik cunku ArrayList'in parenti
        //ArrayList is An Interable, ArrayList is An Object diye tanimlanabilir.
       /*
       1)ArrayListler eleman ekleme ve silme islemlerinde basarisizdirlar.
         o yuzdan eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez
       2) LinkedListler index kullanmadiklarindan node silme ve eklemede re-index yapilmasina gerek yoktur
          Bu da LinkedListleri eleman ekleme ve silmede cok basarili hale getirir
          Bu yuzdan eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.
       3) ArrayList lerde search islemi kolay yapilir cunku indexler adres gibidir.
       4)LinkedList lerde search islemi zor yapilir cunku linkedlistler index kullanmazlar,
         index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir.

        */
        LinkedList<String>s=new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        s.add(2,"Omer");
        s.addFirst("Mahmut Tuncay");
        s.addLast("Emin");
        System.out.println(s);//[Mahmut Tuncay, Nuriye, Orhan, Omer, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye, Emin]
    }
}

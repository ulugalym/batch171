package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a =13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //bir yapinin icinde coklu data depolayabilme icin java Array yapisini olusturmustur
        //ayni data type'de birden fazla datanin saklandigi yapidir
        //Array nasil olusturulur?
        String stdNames []=new String[5];
        //Array'ler console'a nasil yazdirilir?
        //toString() method'unu
        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames);
        /*
        Array'ler deger collectionlardan cok daha hizlidir (superfast).
        Array'lar deger collectionlardan daha az memory kullanirlar
         */
        //Array'e eleman ekleme nasil yapilir?
        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[4]="Recep";
        stdNames[0]="Ekim";
        stdNames[1]="Ulugbek";
        System.out.println(Arrays.toString(stdNames));
        //Array'den specific bir elemani nasil aliriz?
        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);
        System.out.println(stdNames[0]);
        //Array'deki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz.
        //length() stringlerde method (parantezli), arraylerde ise parantezsiz yazilir (method degil).
        for (int i=0;i<stdNames.length;i++){
            System.out.println(stdNames[i]+"!");
        }
    }
}

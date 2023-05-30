package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrayleri kisa yoldan nasil olusturabiliri\?
        int arr[]={63,19,8,313,7,100,4};
        System.out.println(Arrays.toString(arr));
        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.
        int sayac=0;
        for (int w:arr){
            if(w%2==0){
                sayac++;
            }
        }
        System.out.println("Array'de "+sayac+" adet cift sayi, "+(arr.length-sayac)+" adet tek sayi kullanilmisdir");
        //Ornek 2: Size verilen String array'deki isimlerden 5 karakterden az karakter icerenleri console'da yazdiriniz.
        String stdName[]=new String[5];
        stdName[0]="Ajda";
        stdName[1]="Cuneyt";
        stdName[2]="Tom";
        stdName[3]="Ayhan";
        stdName[4]="Filiz";
        System.out.println(Arrays.toString(stdName));
        for (String w :stdName){
            if(w.length()<5){
                System.out.println(w);
            }
        }
        //Ornek3: Bize verilen bir String array'deki isimleri alfabetik siraya koydikdan sonra
        // "F" ile baslayan isimleri haric diger isimleri console'a yazdiriniz
        //Note1: sort() methodu sayisal data type'leri kucukden buyuge siralar(ascending order)
        //note 1: sort() method'u String data type'leri alfabetik olarak siralar (alphabetical order)
        //Note 3: ascending order+alphabetical order==>Natural order
        //Note4: sort() methodu array elemanlarini "Natural Order"a gore siralar
        Arrays.sort(stdName);
        System.out.println(Arrays.toString(stdName));//[Ajda, Ayhan, Cuneyt, Filiz, Tom]
        for (String w : stdName){
            if (w.startsWith("F")) {
                continue;
            }
            System.out.print(w+", ");
        }
    }
}

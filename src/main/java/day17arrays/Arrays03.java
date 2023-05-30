package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin array'de olup olmadigini anlamak icic gereken kodu yazininiz
        String names[]={"K","C","R","A","S"};
        System.out.println(Arrays.toString(names));
        String el="R";
        //1.way
        int counter=0;
        for (String w:names){
            if(w.equals(el)){
                counter++;break;
            }
        }
        //loop bitdikden sonra counteri kontrol ederek arrayin elemani icerip icermedigini tespit etmek
        if (counter > 0) {
            System.out.println("Array has "+el);
        }else{
            System.out.println("Array does not have "+el);
        }
        //2.Way:binarySearch() methodu hizli calisir
        /*
        1)binarySearch() methodunu sort() methodunu kullanmadan kullanmayiniz,
        cunku binarySearch() mantigi sirali elemanlar icin gecerlidir.
        2)binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir.
        binarySearch() methodundan aldiginiz index 0 veya 0dan buyuk ise bu o eleman arrayde var demekdir
        3)binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        "-" isaretinin anlami o eleman yok demekdir
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demekdir.
         */
        Arrays.sort(names);
        int result=Arrays.binarySearch(names,el);
        System.out.println(result);
        if(result<0){
            System.out.println("Array does not have "+el);
        }else{
            System.out.println("Array has "+el);
        }
        int num1=Arrays.binarySearch(names,"A");
        System.out.println(num1);
        int num2=Arrays.binarySearch(names,"K");
        System.out.println(num2);
        int num3=Arrays.binarySearch(names,"U");
        System.out.println(num3);

    }
}

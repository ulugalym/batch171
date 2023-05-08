package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve
        // son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz..");
        int number =input.nextInt();

        // % ==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.

        //bir sayinin son rakamini alabilmek icin o sayiyi 10'a bolun ve kalani alin
        //38671/10=3867 kalan 1
        //bir tam sayiyi baska bir tam sayiya bolarseniz
        // java sonucu kesinlikle tam sayi yapar 38671/10=3867.1 false.
        //Java sonucu tam sayi nasil yapar? ondali kismi iptal edar,
        // java yuvarlama islemi yapmaz 38671/10=3867 true.
        //38671 38671%10=>1; 398671/10=3867      %10=majilisten
        //3867  3867%10=7;   3967/10=386
        //386   386%10=>6;   386/10=38
        //38    38%10=>8;   38/10=3
        //son rakami al
        int lastDigit= number %10;
        //sayiyi kucult
        number=number/10;
        //sondan ikinci rakami al
        int sondanIkinci=number%10;
        //sayiyi kucult
        number=number/10;
        //sondan ucunci sayiyi al
        int sondanUcunci=number%10;
        //sayiyi kucult
        number=number/10;
        //sondan dordunci rakami al
        int sondordunci=number%10;
        //sayiyi kucult
        number=number/10;
        //sondan besinciyi al
        int sondanBesinci=number%10;
        //son rakam oldugu icin  kucultmeye gerek yok
        System.out.println(lastDigit+sondanIkinci+sondordunci+sondanBesinci);

        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
          //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
            // ornegin => 312 icin 3+1+2=6

    }
}

package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek: kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz
        //1.Adim: Scanner class'tan bir object olusturun
        Scanner input = new Scanner(System.in);

        //2.Adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("ilk ismi giriniz...");
        //3.Adim:Uygun methodu kullanarak kullanicinin vredigi datayio memory'e yerlestiriniz
        //next() method kullanicidan tek kelimili string almak icin kullanilir
        String firstName = input.next();
        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();
        System.out.println(firstName+" "+lastName);

    }
}

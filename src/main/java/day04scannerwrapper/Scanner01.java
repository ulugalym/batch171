package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek: kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz
        //1.Adim: Scanner class'tan bir object olusturun
        Scanner input = new Scanner(System.in);


        //2.Adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("ilk ismi giriniz...");
        //3.Adim:Uygun methodu kullanarak kullanicinin verdigi datayi o memory'e yerlestiriniz
        //next() method kullanicidan tek kelimili string almak icin kullanilir
        String firstName = input.next();
        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();
        System.out.println(firstName+" "+lastName);
        System.out.println("Babanin ismini giriniz lutfan..");
        String babaIsmi=input.next();
        System.out.println("Anne ismini giriniz lutfan..");
        String anneIsmi=input.next();
        System.out.println("anneIsmi : " + anneIsmi+"\nbabaIsmi : "+babaIsmi);
        System.out.println("babanin dolu ismini giriniz lutfan...");
        String fatherName=input.nextLine();
        System.out.println("Ananin dolu ismi..");
        String mothername=input.nextLine();
        System.out.println("Babaismi : "+fatherName+"\nAnneismi : "+mothername);


    }
}

package day07Stringmanipulations;

import java.util.Scanner;

public class Stringmanipulations02 {
    public static void main(String[] args) {

        /*
      Ornek:
        Asagidaki kurallara gore kullanicidan girdigi password'u kontrol ediniz
               1)En az 8 character olsun
               2)Space character'i passwordde olmasin
               3)En az bir buyuk harf olsun
               4)En az bir kucuk harf olsun
               5)En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfan passwordunuzu giriniz...");
        String pwd=input.nextLine();
        // 1)En az 8 character olsun
        boolean first=pwd.length()>7;
        System.out.println("first = "+first);
        //2)Space character'i passwordde olmasin
        boolean second=!pwd.contains(" ");
        System.out.println("second = " + second);
        //3)En az bir buyuk harf olsun
        //Note: Buyuk harf olmayanlari sil 
        //      kalan character sayisina bak 
        //      character sayisi sifir ise buyuk harf yok demektir 
        //      sifirdan buyuk ise buyuk harf var demek 
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);
        //4)En az bir kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);
        //5)En az bir rakam olsun
        boolean fifth=pwd.replaceAll("[^0-9]","").length()>1;
        System.out.println("fifth = " + fifth);
        System.out.println("Pasword gecarlimi? " + (fifth && second && third && fourth && fifth));
    }

}

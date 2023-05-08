package day04scannerwrapper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugini aliniz
        //a)Alanini hesaplayiniz ==> kisa kenar *uzun kenar
        //b)cevresini hesaplayiniz ==> 2*kisa kenar + 2*uzun kenar
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz...");
        double shortSide=input.nextDouble();
        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longsSide=input.nextDouble();
        System.out.println(shortSide*longsSide);
        System.out.println(2*shortSide+2*longsSide);
    }
}

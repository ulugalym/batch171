package day03methodobjectcreationscanner;

//java'nin util kutuphanesinden scanner class import edildi
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1. Adim Scanner Class'dan object olustur
        Scanner input =new Scanner(System.in);

        //1. Adim kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfan yasinizi giriniz");

        //3.adim uygun method'u kullanarak kullanicidan verdigi datayi memory'e yerlestiriniz
        byte age =input.nextByte();
        System.out.println("age = " + age);
    }
}

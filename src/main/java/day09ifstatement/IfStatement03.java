package day09ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Ornek:Kullanicinin vermis oldugu character buyuk ise "buyuk harf"
        // kucuk ise ekrana "kucuk harf" yazdiran kodu olusturunuz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan bir character giriniz..");
        char ch=input.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("Buyuk harf");
        }
        if(ch>='a'&&ch<='z'){
            System.out.println("Kucuk Harf");
        }
        char ch1=input.next().charAt(1);
        if(ch1>='A'&&ch1<='Z'){
            System.out.println("Buyuk harf");
        }else if(ch1>='a'&&ch1<='z'){
            System.out.println("Kucuk Harf");
        }else{
            System.out.println("Harf degil");
        }
    }
}

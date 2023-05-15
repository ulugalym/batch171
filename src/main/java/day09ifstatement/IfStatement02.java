package day09ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan bir sayi giriniz..");
        //1.yol;
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("cift sayidir");
        }
        if (num%2!=0){
            System.out.println("tek sayidir");
        }
        //2.yol:kontrol edilen condition sayisi daha az oldugu icin tevsiye eder
        int num1= input.nextInt();
        if(num1%2==0){
            System.out.println("cift sayidir");
        }else{
            System.out.println("tek sayidir");
        }
    }
}

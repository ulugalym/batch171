package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Ternary Statement
        //Ornek1: Sayi ondan kucuk ise consol'a "kucuk" yazdirin degilse "kucuk degil" yazdirin
        //------------if else cozumu------------
        int num=13;
        if(num<10){
            System.out.println("Kucuk");
        }else{
            System.out.println("Kucuk degil");
        }
        //-------ternary cozumu--------
                //Condition  ? Condition true ise calisir  :  Condition false ise calisir
        String sonuc=num<10  ?        "Kucuk"              :          "buyuk";
        System.out.println("sonuc = " + sonuc);
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfan sayi giriniz");
        int sayi=input.nextInt();
        if(sayi%2==0){
            System.out.println("sayi cift");
        }else {
            System.out.println("sayi tek");
        }
        String sonucu=sayi%2==0? "sayi cift":"sayi tek";
        System.out.println("sonucu = " + sonucu);
        String sonuc1=sayi>0? "pozotof":"negatif";
        System.out.println("sonuc1 = " + sonuc1);
        //Ornek4:Kullanicidan iki sayi aliniz, "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz..");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        //1.yol if else
        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        //2.yol Ternary
        double result2=a<b? a:b;
        System.out.println("result2 = " + result2);

    }
}

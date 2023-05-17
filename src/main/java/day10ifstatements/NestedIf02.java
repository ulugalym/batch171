package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        /*
        Example 2: Kullanicidan bir ucgenin kenar uzunluguni aliniz
                  Uc kenari bir-birine esit ise "Eskenar Ucgen" yazdiriniz
                  Sadece iki kenar uzunlugu bir-birine esit ise "ikizkenar ucgen"
                  tum kenarlari bir-birinden farkli ise "Cesitkenar Ucgen"yazdiriniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("ucgenin kenarlari icin 3 tane uzunluk giriniz..");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        boolean ucgenmi=(a+b>c&&c>Math.abs(a-b))&&(a+c>b&&b>Math.abs(a-c))&&(b+c>a&&a>Math.abs(b-c));
        if(ucgenmi){
            if(a==b&&b==c&&a==c){
                System.out.println("Eskenardir");
            } else if (a==b||b==c||c==a) {
                System.out.println("Ikizkenar ucgen");
            }else{
                System.out.println("Cesitkenar ucgendir");
            }

        }else{
            System.out.println("Ucgan degildir");
        }
    }
}

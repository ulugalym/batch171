package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
         /* Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
            Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
            9 - 14 ==> 10  12  14    */
        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz");
        int start = input.nextInt();
        System.out.println("Bitis degerini giriniz");
        int end = input.nextInt();
        if (start > end) {
            System.out.println("Baslangic deger bitis degerindan kucuk olamaz...");
        } else {

            for (int i = start; i < end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        //Ornek2: Hic sayi kullanmadan 1dan 100-e kadar olan sayilari console'a yazdiriniz.
        for (int i = 'd' / 'd'; i < 'e'; i++) {
            System.out.print(i + " ");
        }
        //int d = 'e';
        //System.out.println("d = " + d);
        /*
        Note1: Bazi loop'lar sonsuz defa calisabilir, Bu tarz looplara Infinite (sonsuz)loop denir
        Infinite loop genellikle "Increment/decrement" kisminda yapilan hatadan kaynaklanir
        for (int i=1; i<10;i--){   }
        Note2: Loop olusturdugumuzda "ikinci kismi"(loop calisma sarti) yazmazsaniz  Infinite (sonsuz) loop olur
            for (int i = 0;     ; i++) {      }
       Note 3: Bazi looplar hic calimayabilir

        for (int i = 1; i <0 ; i--) {       }
         */

    }
}

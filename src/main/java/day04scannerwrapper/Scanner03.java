package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //ornek: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz12.9

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayi giriniz");
        double firstNumber=input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);
    }
}

package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //ornek: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz12.9

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double firstNumber=input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);
        System.out.println("Test sonuclarinin 10 sunuchunu giriniz...");
        double test1=input.nextInt(),test2=input.nextInt(),test3=input.nextInt(),test4=input.nextInt(),
                test5=input.nextInt(),test6=input.nextInt(),test7=input.nextInt(),test8=input.nextInt(),
                test9=input.nextInt(),test10=input.nextInt();
        System.out.println((test1+test2+test3+test4+test5+test6+test7+test8+test9+test10)/10);
    }
}

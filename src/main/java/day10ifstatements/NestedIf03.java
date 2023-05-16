package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {


    /*
    Password'un ilk harfi buyuk ise 'A' olursa
    "Gecerli password" yazdirin degilse "Gecersiz password" yazdirin
    Adana ==> Gecarli
    Password'un ilk harfi kucuk ise 'z' olursa
    "gecerli password" yazdirin degilse "gecersiz password" yazdirin
    zehirli ==> Gecerli
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz..");
        String pwd = input.nextLine();
        if (pwd.charAt(0)>='A'&&pwd.charAt(0)<='Z'){
            if(pwd.charAt(0)=='A'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password cunku buyuk harf ama A degil");
            }
        } else if (pwd.charAt(0)>='a'&&pwd.charAt(0)<='z') {
            if(pwd.charAt(0)=='z'){
                System.out.println("Gecerli password cunku kucuk harf ama z degil");
            }else{
                System.out.println("Gecersiz password");
            }
        }else{
            System.out.println("Ilk character harf olmali..");
        }
    }
}

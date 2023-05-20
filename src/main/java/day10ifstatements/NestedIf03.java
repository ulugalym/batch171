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
        //NOTE: Eger bir method'u tekrar kullanmak istiyorsaniz onu bir veriable'a atayarak  kullanmak daha makuldir
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz..");
        String pwd = input.nextLine();
        char firstChar=pwd.charAt(0);
        if (firstChar>='A'&&firstChar<='Z'){
            if(firstChar=='A'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password cunku buyuk harf ama A degil");
            }
        } else if (firstChar>='a'&&firstChar<='z') {
            if(firstChar=='z'){
                System.out.println("Gecerli password ");
            }else{
                System.out.println("Gecersiz password cunku kucuk harf ama z degil");
            }
        }else{
            System.out.println("Ilk character harf olmali..");
        }
    }
}

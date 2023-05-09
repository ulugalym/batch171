package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Ornek kullanicidan adresini aliniz ve ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);


        System.out.println("Lutfan adresinizi giriniz..");
        //nextline() method'u kullanicidan cok kelimeli String almak icin kullanilir
        String address= input.nextLine();
        System.out.println(address);

        System.out.println("Lutfan arzinizi yaziniz ...");
        String arzu=input.nextLine();
        System.out.println(arzu);
    }
}

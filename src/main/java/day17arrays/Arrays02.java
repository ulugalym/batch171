package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicinin coklu datayi bir arraya yerlestirebilmesi,
        // istedigi zaman durdurabilmesi icin gerekken kodu yazdirin.
        /*
        1)Kullanicidan data almak icin Scanner object olustur
        2)Coklu data'yi yerlestirmek icin bir array olusturmaliyiz
        3)Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyiz
        4)Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan eklemek istediginiz egrenci sayisini giriniz...");
        int numOfElements=input.nextInt();
        String stdName[]=new String[numOfElements];
        System.out.println("Islemi durdurmak icin 'q'ya basiniz...");
        for (int i=0;i<stdName.length;i++){
            System.out.println((i+1)+" .ogrenci ismini giriniz");
            String name=input.next();
            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdName[i]=name;
            }
        }
        System.out.println(Arrays.toString(stdName));
    }
}

package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {
        /*
        Asagdaki gordugunuz sekli console'a yazdiran kodu olusturunuz
        xxxxx
        xxxxx
        xxxxx
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Satir (Row) sayisini giriniz");
        int row= input.nextInt();
        System.out.println("Sutun (column) sayisini giriniz");
        int column= input.nextInt();
        for (int i=1;i<=row;i++){ //disdaki loop satirlar icin satir sayisi kadar calisir
            for (int k=1;k<=column;k++){ //icteki loop yan yana yazdigindan sutunlar icin sutun sayisi kadar calisir
                System.out.print("x ");
            }
            System.out.println(); //satir yanyana yazdirdikdan sonra pointeri bir sonraki satira almak icin
        }
    }
}

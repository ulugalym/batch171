package day12nastedternaryswitchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7
        Scanner input=new Scanner(System.in);
        System.out.println("gun isimlerini giriniz");
        String dayName=input.next();
        if(dayName.equalsIgnoreCase("sunday")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("monday")) {
            System.out.println(2);
        }else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        }else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        }else{
            System.out.println("Lutfan gecerli bir gun isim giriniz");
        }
        //2.yol switch
        switch(dayName.toLowerCase()){
            case"sanday":
                System.out.println(1);
                break;
            case"monday":
                System.out.println(2);
                break;
            case"tuesday":
                System.out.println(3);
                break;
            case"wednesday":
                System.out.println(4);
                break;
            case"thursday":
                System.out.println(5);
                break;
            case"friday":
                System.out.println(6);
                break;
            case"saturday":
                System.out.println(7);
                break;
                default:
                System.out.println("Lutfan gecerli bir gun ismi giriniz");


        }
    }
}

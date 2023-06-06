package day20statickeywordconstructors;

public class StaticBlocks01 {
    //Bir variable olusturdugunuzda deger atamazsaniz o variable'ni "initialize" etmediniz demekdir.
   static double pi;
   static String shape;
   //Note 1:static block'lar static variable'lari initialize etmek icin kullanilirlar
    //ve class icinde herseyden once calistirilirlar.
    //birden fazla static block oldugunda static blocklar yukaridan asagiya dogru yani yukarida olan once calisir.
    static{
        pi=3.14;
        System.out.println("Static block 1");
    }
    static{
        shape="Circle";
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {
       //Bazan main methoddat calistirilmadan once variable'larin hazir hale getirilmesi gerekir.
        //bu nedenle static block'lara ihtiyac duyabiliriz.

        //static variable'lar static block'lar icinde initialize edilirse
        // o class'in icinde herseyden once hazir hale getirilmis olur.
        System.out.println(pi);
        System.out.println("main method");
    }
}

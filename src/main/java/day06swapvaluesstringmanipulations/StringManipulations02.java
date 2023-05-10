package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //ornek1:"s" string'inin "money" ine bitip bitmedigini kontrol ediniz.
        boolean isend =s.endsWith("money");
        System.out.println("isend = " + isend);

        //Ornek 2:
        String s1=s.replace("money","dollar");
        System.out.println("s1 = " + s1);//Learn Java earn dollar
        //ornek3:
        String s2=s.replace("earn","win");
        System.out.println("s2 = " + s2);//Lwin Java win money
        //ornek 4:
        String s3=s.replace("a","*");
        System.out.println("s3 = " + s3);//Le*rn J*v* e*rn money
        //note: replace () methodunda
        //
        //
        //ornek5:
        String s4=s.replace("n","xxx");
        System.out.println("s4 = " + s4);//Learxxx Java earxxx moxxxey

        //ornek6:
       String s5= s.replace("e","");
        System.out.println("s5 = " + s5);//Larn Java arn mony

        String t = "Ali 13 yasindadir!...";

        //Note: bir gurup datayi ifade etmek icin "Regular Expressions" (Regex) kullanilir.

        //ornek7:
        /*
                meshur Regex'ler
          1)Tum takamlar                             ==> [0-9]
          2)tum kucuk harfler                        ==> [a-z]
          3)tum buyuk harfler                        ==> [A-Z]
          4)tum kucuk ve buyuk harfler               ==>[a-zA-z]
          5)tum harler ve rakamlar                   ==> [a-zA-Z0-9]
          6) tum noktalama isaretleri                ==>\\p{Punct}
          7) tum sesli harfler                       ==> [aeiouAEIOU]
          8) tum x,q,w harfleri                      ==> [xqw]
          9)kucuk harflerden farkli tum karakterler  ==> [^a-z]
          10)tum harflerden farkli tum character'ler ==>[^a-zA-Z]
         */

       String t1= t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);// Ali ** yasindadir!...

    }
}

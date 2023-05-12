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


        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        //Ornek 2: "t" stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Ornek 3: "t" stringindeki tum sesli harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Ornek 4:  "t" stringindeki kucuk harfler disindaki tum characterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Ornek 5: "t" stringindeki tum harfler disindaki tum characterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Ornek 6: "t" stringindeki space ler disindaki tum characterleri "?" e ceviriniz
        String t6 = t.replaceAll("[^ ]", "?");
        System.out.println(t6);//??? ?? ??????????????

        //Ornek 7:  "t" stringindeki sesli harfler disindaki tum characterleri "&" e ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&


    }
}

package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir.

        String s="Java is easy";
        //ornek:"s" string 'indeki tum charakterleri buyuk harf yapiniz
        String sUpper=s.toUpperCase();
        System.out.println("sUpper = " + sUpper);

        //Ornek2:"s" string 'indeki tum charakterleri kucuk harf yapiniz
        String sLower=sUpper.toLowerCase();
        System.out.println("sLower = "+sLower);

        //Ornek3:"s" String'indeki ilk character'i aliniz.
        char firstS=s.charAt(0);
        System.out.println("firstS = " + firstS);
        //Ornek 4:
        char secondS=s.charAt(1);
        char secondLastS=s.charAt(10);
        System.out.println("ikinciS = " + secondS);
        System.out.println("sondanIkinciS = " + secondLastS);
        System.out.println(""+secondS+secondLastS);
        //Ornek5:
        int sLength=s.length();
        System.out.println(sLength);
        int sUpperLength=sUpper.length();
        System.out.println("sUpperLength = " + sUpperLength);
        //Ornek6: "s" string'indeki ilk dort character'i aliniz
        //substring(0,4)==> ilk index dahil, ikinci index dahil degil.
        String sub1=s.substring(0,4);
        System.out.println(sub1);  //Java
        String sub2=s.substring(0,12);
        System.out.println("sub2 = " + sub2);//Java is easy
        //ornek7:
        String sub3=s.substring(5,7);
        System.out.println("sub3 = " + sub3);//is
        //ornek8:
        String sub4=s.substring(8,12);
        System.out.println("sub4 = " + sub4);//easy

        //ikinic yol
        //bir charakteri'den baslayip string'in sonuna kadar almak isterseniz, ikinci index'i yazmayiniz
        String sub5=s.substring(8);
        System.out.println("sub5 = " + sub5);
        //ornek 9: "s" string'inde "money" kelimesi var oluyp olmadigini kontrol ediniz.
        boolean isExist=s.contains("money");
        System.out.println("isExist = " + isExist);//false

        //Ornek10:"s"string'inin belli bir hatfle baslayip baslamadigini kontrol ediniz
        boolean isStar=s.startsWith("Java");
        System.out.println("isStar = " + isStar);//true

        //ornek 11:"s" srting'inin 6.character'den itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        //
       boolean isBegin= s.startsWith("i",5);
        System.out.println("isBegin = " + isBegin);


    }
}

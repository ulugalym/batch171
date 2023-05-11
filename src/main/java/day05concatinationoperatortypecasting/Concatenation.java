package day05concatinationoperatortypecasting;

public class Concatenation {
    public static void main(String[] args) {
        //ornek 1: Bir string ve iki int veriable olusturun. String degeri ile int lerin toplamini console'a yazdirin
        String s="elma";
        int a=10;
        int b=11;
        System.out.println(s+a+b);//elma1011==>concatination
        System.out.println(s+(a+b));//elma21
        System.out.println(s+a*b);//elma110
        System.out.println(a+b+s);//21elma
        System.out.println(a+s+b);//10elma11

        //Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java'da "+" sembolu iki string arasinda veya
        // bir string ve bir sayi arasinda kullanilirsa concatination islemi olur
        //concatination islemi birlestirme yapar
        //note: Concatination islemlerinde java matematikte'ki islem onceligi kurallarini kullanir
        /*
        1)once uslu sayilar
        2)parantez ici islemler yapilir
        3)carpma ve bolme islemleri yapilir
        4)toplama ve cikarma islemleri yapilir
        5)ayni oncelikli olanlarda soldan saga baslanir
         */

        //ornek 2: size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        String shirt="2300";
        String shoes="5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf() string degerini integer'a cevirir
        int toplamFiyat=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500
        int carpma =Integer.valueOf(shirt)*Integer.valueOf(shoes);
        System.out.println(carpma);
       int arti= Integer.valueOf(shirt)-Integer.valueOf(shoes);
        System.out.println(arti);

        //ornek3: size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        String tv ="$1100";
        String radio="$300";
        System.out.println(tv+radio);//$1100$300
        tv=tv.replace("$","");
        radio=radio.replace("$","");

        System.out.println(tv+radio);//1100300

        int totalPrice=Integer.valueOf(tv)+Integer.valueOf(radio);
        System.out.println(totalPrice);//1400
        //Note :valueOf() method'u tum karakterleri rakam olan String'leri sayilara cevirir
        //Eger valueOf() method'u kullanilirkan string'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //bu tarz hatalari duzeltmeyi ilerleyen derslerimizide ogrenecegiz
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir
    }
}

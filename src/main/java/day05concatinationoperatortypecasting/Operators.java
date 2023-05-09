package day05concatinationoperatortypecasting;

public class Operators {
    /*
    1)+,_,*,/  islemleri java'da matematik'te kullanildigi gibi kullanilir
    note1: int / int ==> int olur
    note2:double +int==>double olur.
    cunku:javada matematiksal islemlerde farkli data type'leri kullanilirsa
    sonuc her zaman buyuk data type'inda olur.

    2)Java'da "Logical Operator"lar vardir. AND veOR islemleri "Logical Operator"lerdir.
       cay    and    kahve   sonuc           /         cay   or    kahve    sonuc:
       true   and    false    false          /         true  or    false    true
       false  and    true     false          /         false  or    true     true
       false  and    false    false          /         false  or    false    false
       true   and    true    true            /         true   or    true     true
       -----------------------------------------------------------------------------
       i)Adn (&&) isleminden true alabilmek  /    ii)OR (||) isleminde bir tane true sonucu true yapmaya yeter
       icin her sey true olmalidir .         /       OR (||) isleminde sonucun false olmasi icin hersey false
       And (&&) islemi "perfectionist"dir.   /       olmalidir.
       And (&&) isleminde bir tane bile false/       OR (||) islemi "polyanna" gibidir.
       sonucu false yapar.                   /

       iii) NOT operator (!) true olani false, false olani true yapar.
            !true => false
            !false=> true
            !!true=> true
            !!false=>false

       3)Comparison (Karsillastirma)operators
       <,>,<=,>=,==,!=
       NOte: Karsilastirma operatorlarini kullandiginizda KESINLIKLE boolean (true veya false) alirsiniz
       Note: AND islemi icin (&&) kullaniriz & kullanimida gecerlidir
       fark nedir?
       "&&"kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez, dolaysiyle hizli calisir
        cunku and isleminde ilk ifade false ise digerlerinin ne oldugunun bir onemi yoktur sonuc false olur
              "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir
              Biz bu yuzden hep "&&" kullaniriz


     */
    public static void main(String[] args) {
        boolean first = 3<5;
        boolean second= 2+3!=5;
        boolean third = 2+3*5>=19;
        System.out.println(first+"-"+second+"-"+third);//true-false-false
        System.out.println(first&&second);             //false
        System.out.println(first||second||third);      //true
    }
}

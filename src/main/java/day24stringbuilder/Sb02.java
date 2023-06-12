package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy
        sb1.reverse();//String in ters cevrilmesi looplar ilede yapilir bu kisa yoldur
        System.out.println(sb1);//ysae si avaJ
        sb1.deleteCharAt(6);
        System.out.println(sb1);//ysae s avaJ
        //4,,5,6 silinir 7 silinmez
        sb1.delete(4,7);//baslangic index dahil bitis index haric olmak uzere araligi siler.
        System.out.println(sb1);//ysaeavaJ
        // sb1.replace(2,5,"xxx"); ==> 2 dahil, 5 haric olmak uzere 2,3, ve 4 deki karakterlerin yerine xxx koyar
        sb1.replace(2,5,"X");
        System.out.println(sb1);//ysXvaJ
        sb1.insert(3,"000");
        System.out.println(sb1);

        //sonuc 0 ise alfabetik olarak ayni siradalar demekdir
        //sonuc -1 ise sb2, sb3 den alfabetik olarak 1 onde demekdir
        //sonuc 1 ise sb2, sb3 den alfabetik olarak 1 sonda demekdir
        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Java");
        int r1=sb2.compareTo(sb3);
        System.out.println(r1);
        /*
        compare iki sb'i esit mi diye kontrol etmek icin ilk harften baslayarak tüm karakterleri karşılaştırır.
        Aynı olan karakterler için bir şey return etmezken farklı olan ilk karakter için ascii tablosuna göre
        kaç değer geride veya ileride olduğunu yazdırır. tamamen aynı ise bize 0 return eder
         */

        //StringBuilder nasil String e cevrilir?
        //toString() methodu sayesinde cevrilir
        //String classte var olan ama stringBuilder classta var olmayan toUpperCase methodu gibi methodlara ihtiyac duydugumuzda
        //toString() kullanarak string class methodlarini kullanabiliriz
        String str=sb2.toString().toUpperCase();
        System.out.println(str);

        System.out.println(sb2);
        //String nasil StringBuilder e cevrilir
        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);
    }
}

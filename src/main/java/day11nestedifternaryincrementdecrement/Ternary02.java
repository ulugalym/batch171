package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        //ornek 1
        int a=10;
        int b=20;
        int r1=a<b?a++ : ++b;
        System.out.println("r1 = " + r1);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //ornek2:Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //-4==> -1*-4    4==>4    0==>0
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan sayi giriniz...");
        int c=input.nextInt();
        int r2=c<0? -1*c:c;
        System.out.println("r2 = " + r2);
        //Ornek 3:Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        //"farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz
        int m=5;
        int n=-6;
        Object r3=(m>0&&n>0)||(m<0&&n<0)? m*n:"farkli isaretli sayilari carpamiyorum";
        System.out.println("r3 = " + r3);

        //"Object" java'da butun "Non-Primitive Data type"(Class)larinin ortak "Parent"(baba-anne)idir.
        //"Object"in Parenti yokdur
        //Farkli data typr'lar icin ortak bir variable olusturmak istedigimizde, data type olarak object kullanabiliriz.
        //Java'da "Object", insanlik aleminde "Hz Adem'e benzar"

        //Ornek4:Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yazdiriniz
        System.out.println("Uc basamakli sayi giriniz");
        int p =input.nextInt();
        p=Math.abs(p);
        String r4=p>99&&p<1000 ? p+ " uc basamaklidir": p+ " uc basamakli degildir";
        System.out.println("r4 = " + r4);

    }
}

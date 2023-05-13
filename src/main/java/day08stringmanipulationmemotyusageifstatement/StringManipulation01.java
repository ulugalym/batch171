package day08stringmanipulationmemotyusageifstatement;

public class StringManipulation01 {
    //Ornek1:bir String'in hic character icermedigini (Bos string olduguun) kontrol eden kodu yaziniz.
    public static void main(String[] args) {
        //1.Yol length() methodu ile cozum
        String str="";
        int kac=str.length();
        System.out.println("kac = " + kac);
        boolean result1=str.length()==0;
        System.out.println("String bos mu? = " + result1);//String bos mu? = true
        
        //2.Yol tavsiye edilir
        //Java bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
        boolean result2=str.isEmpty();
        System.out.println("is Empty? = " + result2);//is Empty? = true
        //Ornek2: bir String'in space haric hicbir character icermeyandigini kontrol eden kodu yaziniz
        String t ="         ";
        //1.Yol
        boolean result3=t.replace(" ","").length()==0;
        System.out.println("result3 = " + result3);
        //2.Yol
        boolean result4=t.replace(" ","").isEmpty();
        System.out.println("result4 = " + result4);
        //3.yol 
        boolean rresult5=t.isBlank();
        System.out.println("rresult5 = " + rresult5);
        //isBlank() methodu sadece space iceren String'ler icin true verir, space disinda bir character var ise false verir
        //isBlank () methodu bos stringler icin de true verir
        //isBlenk() methodu space+hic birsey icin true verir
        //isEmpty() methodu sadece hi birsey icin true verir
        
        //Ornek 3: Bir string'de a, i, e character'lerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //"Java is easy to learn"==>1+5+8==>14
        // 123456789...index
        String r="Java is easy to learn";
        int idxA=r.indexOf('a');
        System.out.println("idxA = " + idxA);
        int idxI=r.indexOf('i');
        System.out.println("idxI = " + idxI);
        int idxE=r.indexOf('e');
        System.out.println("idxE = " + idxE);
        System.out.println(idxE+idxA+idxI);
        
        //Ornek4: Bir string'deki Java kelimesinin ilk olarak kacinci index'te kullanildigini gosteren kodu yazdiriniz
        //"Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J'nin) index'ini almis olurus
        String u="Ah Java vah Java sensiz olmuyor Java.";
        int idxJava=u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//3
        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
        int idxjava=u.indexOf("java");
        System.out.println("idxjava = " + idxjava);//-1
        //Ornek 5:Bir string'de a, i, e character'lerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        String v="Java is easy to learn";
        int idxOfA=v.lastIndexOf('a');
        System.out.println("idxOfA = " + idxOfA);
        int idxOfE=v.lastIndexOf('e');
        System.out.println("idxOfE = " + idxOfE);
        int idxOfI=v.lastIndexOf('i');
        System.out.println("idxOfI = " + idxOfI);
        System.out.println(idxOfA+idxOfE+idxOfI);
        //Note: lastINdexOf() methodu olmayan characterler icin her zaman -1 verir.
        
        
    }
}

package day08stringmanipulationmemotyusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Ornek :  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //      abc@gmail.com   ===> gmail
        String a ="abc@gmail.com";
        int startingIndex=a.indexOf('@')+1;
        int endingIndex=a.indexOf('.');
        String companyName=a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);//companyName = gmail

        System.out.println("hard coding ==> " + a.substring(4, 9));
        //Ornek2:Verilen iki string'gin bir birinin ayni olup olmadigini kontrol eden kodu yaziniz
        String h="ali Can";
        String i="Ali Can";
        boolean result=h.equals(i);
        System.out.println("result = " + result);//false
        //Java'da memory kullanimi
        /*
        Javanin urettigi ve kullandigi herseye data denir.
        Javada iki turlu hafiza vardir.
         1) Stack Memory ==> Small gibi
         *) Kucuk Memorydir.
         **) primitive data typelarini ve non- primitive
         data typelarinin referancelarini(adreslerini) barindirir.

         2)Heap Memory ==> Huge Memory gibi
         *) Non- primitive data type'larini barindirir
         Javada Heap Memory'de olusturulan tum datalar icin bir
         referance(adres) bilgisi olusturulur. Referance bilgileri
         stack memory'de yer alir.Herhangi bir sebeple Heap
         Memorydeki datanin referance'silinirse "Garbage Collector "
         Memory'i temizler.
         */
        /*
        java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memorydir
            b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2) Heap Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir

         */
        String s="Tom";
        String t="Terry";
        String r=new String("Tom");
        System.out.println(s==t);      //false
        System.out.println(s.equals(t));
        System.out.println(s==r);
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar. "s"
        
        //-----------------------------------------------------------------------------------------
        //Ornek3:Verilen iki string'gin bir birinin ayni olup olmadigini buyuk harf kucuk harf dikkate almadan
        // kontrol eden kodu yaziniz      
        String j="ali Can";
        String k="Ali Can";
        boolean result3=j.equalsIgnoreCase(k);
        System.out.println("result3 = " + result3);
    }
}

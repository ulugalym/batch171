package day28interfacecollections;

public interface Ac {
    /*
    1)Bir interface'i bir classin parenti yapmak icin "implements"keywordini kullaniriz.
    2)Java parentler class oldugunda multiple parent a musaade etmez ama biz bazen
      multiple parente ihtiyac duyariz.
      Bu ihtiyaci gidermek icin java interface adinda bir yapi olusturdu
      bu yapi sayesinde bir class icin coklu interface parent olusturulabilir.
    3)Interfacelerin icine concrete method konulamaz, cunku conrete methodlarda body vardir,
      ve body o isin nasil yapacagini belirtir. Isin nasil yapilacagi bir cok detay icerir ve bu child
      classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyin
      nasil yapilacagini childa birakirsaniz child classin karisikligini engellemis olursunuz
    4)interfacelerdeki tum methodlar otomatik olarak public dir, abstract tir. Ama static degildir.
    5) interfaceler concrete method iceremezler dolaysiyol interface icindeki hicbirsey istege bagi degildir
      her sey child classlar icin mecburidir. Bu yuzden interfacelere "to-do list" de denir.
      6)Coklu interface parentlerin herbirinin icine aymi isimli methodlar koyabiliriz.
        mesela Ac nin, Engine'in ve Securuty'nin iclerine "run()" methodu koymak gibi
        child class herhangi birini override ettiginde hepsini override etmis gibi olur. Sonrada
        body'yi Child class'da yazarak uygulamasini yapmis olur.
    7)a)interface'lerdeki tum variableler otomatik olarak (default)olarak finaldir. Bu yuzdan interface icindeki
      variable olusturdugunuzda mutlaka deger atamasi yapmalisiniz. Bilindigi gibi final variable'lerin degerleri degistirilemaz.
      b)interface'lerdeki tum variable'ler otomatik olarak (default) olarak publicdir.
      c)interface'lerdeki tum variable'ler otomatik olarak (default) olarak staticdir
      =>dolaysiyla interface'lerde variable cagirirken interface adini kullanarak cagiririz, bu hem static variable olmanin geregidir
      hemde okunurlugu artirir.
    8)Normalde "interface" icine "concrete method" konulamaz ama bazi ozel durumlarda "concrete method"
      koymamiz gerekirse default keyword kullanarak bunu yapabiliriz.
      static keywordunu kulllanarakta interface icine conrete method koyabiliriz.
    9)"default" keyword unu olusturdugunuz "concrete methodlara interface in child classdan
      object olusturarak ulasabilirsiniz.
      "static keyword" unu kullanarak olusturdugumuz concrete methodlara ulasmak icin
      object olusturmaya gerek yoktur,interface ismi yeterlidir.
    10)interfacelerden object olusturulamaz. interfacelerin constructori yoktur.
    11)
        Child        parent         keyword
        class        class     ==>  extends
        interface    interface ==>  extends
        class        interface ==>  implements
        interface    class     ==>  olamaz

        ayni ise "extends" farkli ise implements kullaniriz, ve interface concrete classin childi olamaz


        Abstract class ile interface arasindaki farklar nelerdir?
      1)Abstract classlar hem abstract hemde concrete methodlar icerebilir
        fakat interfaceler sadece abstract method icerir.
        ama interfacelerde istersek "default" ve "static" keywordlerini kullanarak
         "concrete" method uretebiliriz.
      2)Abstract classlar multiple inheritance'i desteklemez. Ama interface'ler destekler
      3)Abstract classlar icinde her turlu variable olusturulabilir,
        interface ler icindeki variable'lar public, static, ve final olmalidir.
      4)interface classin childi olamaz ama abstract class classin childi olamaz
      5)Abstract classlarda constructor vardir ama object uretemez,
        interface lerde constructor yoktur bu yuzden object uretilemez.
     */
    public void cool();
    void run();
    public static final int price=2000;
}

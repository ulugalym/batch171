package day27abstraction;

public abstract class Courses {
    //Abstraction
    public abstract void math();
    public void art(){
        System.out.println("Learn art");
    }
    //public abstract void science();
    /*
    1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece child
     classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak "Abstraction"yapariz.
   2)Bazen parent class daki methodun bodysi hicbir child class tarafindan kullanilmaz.
     Bu durumda parenttadi methoda body yazmak hic kullanilmadigi icin mantikli degildir.Bizde yazmayiz.
   3)Body si yazilmayan method Abstract method denir. Abstract ingilizcede vucutsuz yada sugut kavram denir.
   4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullaniriz.
     Javaya bu methodun bodysi olmayacak deriz.
   5)abstract keywordunu kullaninca elde ettigimiz abstract method normal claslara konulamaz
     o yuzdan classida abstract yapmaliyiz.
   6)Parentdeki method abstract ise butun child classlar o methodu override etmek zorunda.
     Bu yuzdan tum childlar icin mecbur olmasini istedigimiz fonksionlari abstract yapmaliyiz.
   7) Bodysi olan methodlar (=Concrete Method) abstract classlarin icine yazilabilir.
      Abstract methodlar concrete classlarin yazilamazlar. Concrete methodlar
      child classlar tarafindan override edilmek zorunda degildir.
   8) "abstract" keyword ile method body bir methodda ayni anda kullanilamaz.
   9)final methodlar abstract olamazlar. final methodlar override edilemezler, halbuki abstract methodlar
   override edilmek icin olusturulurlar. Bu celiskidir, bu yuzden java abstract methodlarin final olmasina musaade etmez.
   10)"abstract class"larin icinde abstract methodlar olur. "abstract method"lar bodysi olmadigndan
      eksik methodlar gibi dusunulebilir, yani abstract class icinde eksik bir yapi barindirir.
      Eger siz abstract classdan object uretirseniz bu eksiklik objecte yansir, java bunu istemez
      cunku eksik object eksik is yapar buda applicationin yanlis calismasina sebep olur.
      java application u korumak icin abstract classlardan object uretilmasini engellemisdir.
   11) "abstract class" larin constructor i vardir ama object olusturamazlar.
   12)"abstract class"in abstract childdi veya concrete childi olabiliyor. Eger child abstract ise
      abstract methodlari override etmek zorunda degildir.
   13)"abstract method" lar private olamazlar cunku child classlar abstract methodlari
      private yapinca kullanima kapali olur. Bu celiskidir, bu yuzden java abstract methodlarin
      private olmasina musaade etmez
   14)Classlar final oldugunda child classa sahip olamazlar. Ama abstract classlar icin child class
      olmalidir, cunku child classlar abstract parent classdaki abstract methodlari kullanirlar
      bu yuzdan java abstract classlarin final olmasina musaade etmez.

     */
}

package day26polymorhphism;

public class Animal {
    /*
    Parent Class daki methodu child class icinde ozellistirerek kullanmaya Overriding denir.
    2) Overriding de methodun parantezine, method ismine dokunulmaz, (==>method signature) degistirilmez,
    methodun body si degistirilir.
    3) private methodlar override edilemezler
    4) Child daki methodun access modifieri parent Classdaki override edilmis method (Overridden Method)un
    access modifierinden dar olamaz. Aynisi olabilir yada genis olabilir.
    5) Child classda override edilen methodun return type ile parentteki methodun return type arasinda
    IS-A iliskisi varsa return type degistirilebilir.
    6)Methodun return type i primitive ise overriding yaraken return type degistirilimez. Cunku return type ya ayni olur veya
    parent tan secilir, ama primitive ler arasinda parent child iliskisi olmadiginidan parent tan secmek sozkonusu olamaz.
    7)Childda override edilen methodun return type ile parenttaki methodun return typi arasinda IS-A iliskisi
    yoksa return type degistirilemez.
    Mesela:
    Integer wrapper class ile Long Wrapper class arasinda IS-A iliskisi yoktur. O yuzden degistirilemez.
    8)Methodun return type i void ise, Overriding yaparkan return type degistirilemez.
    9) Static methodlar override edilemezler. Cunku static methodlar tum childlar icin ortak methodlardir.
    mesela bir child bir ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu nedenle java
    static methodlarin override edilmesine izin vermez.
    10) final methodlar override edilemezler.
        a) final keywordini veriable larda kullanabilirsiniz
            i) final veriable a mutlaka deger atamalidir
            ii) final ilk atanan deger degistirilemez
        b) final keywordunu method larda kullanabilirsiniz
            i) final methodun bodysy degistirilmez
            ii) method bodysi degistirilemeyince override yapmak mumkin olmaz
        c) final keywordunu class larda kullanabilirsiniz
            i) class final ise o classin childi olmaz

    Polymorphism=Method overloading +method overriding
     */
    public void eat(){
        //parentdeki override edilmis eat() methoduna "Overridden method" denir
        System.out.println("Animals eat.");
    }
    public void drink(){
        System.out.println("Animals drink.");
    }
    public Animal create(){
        return new Animal();
    }
    public int add(int a,int b){
        return a+b;
    }
    public Integer multiply(Integer a,Integer b){
        return a*b;
    }
    final int age=5;
    public final double circleArea(double r){
        return 3.14*r*r;
    }
}

package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        // object nasil olusturulur

        //new koyword'u sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor java'da object'leri olusturmak icin kullanilan ozel bir methodtur
        //class ismi + Object ismi + Assignment Operator + "new" keyword + Constructor
           Car            myCar            =                  new            Car();

        System.out.println("myCar.Fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
          myCar.dur();
          myCar.hareket();


          Student aliCan = new Student();
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.feed();
        aliCan.study();

        //homework
        //icinde isim ve yas variable'lari ile teach method'u bulunan bir teacher obcect olusturun
        // ve obje uzerinde bu ozellikleri kullanini

    }
}

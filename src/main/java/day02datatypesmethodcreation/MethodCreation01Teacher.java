package day02datatypesmethodcreation;

public class MethodCreation01Teacher {

   /* Java'da method nasil olusturulur?

            1)main methodun disinda classin icinde olusturulur
                1                    2              3            4    5
           2) Access Modifier   + Return type  +  Method ismi  + () + {}
     */

    /*
    Olusturulan methodlar nasil kullanilir?
    1) Methodu olusturmak methodu calistirmak icin yeterli degildir.Kullanilmak istenen method
        main method un icinden kullanilir
    2) method'un ismini + () yazin
    3) varsa islem yapacagınız datalari parantezin icine koyun
        buu islem method call (method cagirma) olarak adlandirilir
   4) method name + parametreler ==> method signature
     */
    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(5,12);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

        System.out.println( charpmaTablosu(5));
        int can=kisaltma(90,76);
        System.out.println(can);
        System.out.println(cokSanliBolme(80, 160, 1, 2));

    }
    //Ornek 1: toplama islemi yapan bir method olusturunuz
    public static int toplamaYap(int a, int b){//bu kisimda method kapsaminda kullanilmasini ve islenmesini istedigim datalari deklare ediyoruz
        return a+b;
        //return demek bu methodun cagrildigi yere bu degeri return et demek
    }
    public static int charpmaTablosu(int a){
        return 3*a;
    }
    //main method static oldugu icin main method icinde kullanacağımız method static olmalidir
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz
    protected static long multiply(int a, int b){
        return a*b;
    }
    public static int kisaltma (int w, int g){
        return w-g;
    }


    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullaniniz
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }
    public static int cokSanliBolme(int a, int b, int c, int d){ return a/b+c/d;}
    /*
    1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
    2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
     */
}

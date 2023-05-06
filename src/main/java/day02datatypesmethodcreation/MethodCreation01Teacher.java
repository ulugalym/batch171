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
        bu islem method call (method cagirma) olarak adlandirilir
   4) method name + parametreler ==> method signature
     */
    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(5,12);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));
    }
    //Ornek 1: toplama islemi yapan bir method olusturunuz
    public static int toplamaYap(int a, int b){//bu kisimda method kapsaminda kullanilmasini ve islenmesini istedigim datalari deklare ediyoruz
        return a+b;
        //return demek bu methodun cagrildigi yere bu degeri return et demek
    }
    //main method static oldugu icin main method icinde kullanacağımız method static olmalidir
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz
    protected static long multiply(int a, int b){
        return a*b;
    }

    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullaniniz
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }
    /*
    1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
    2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
     */
}

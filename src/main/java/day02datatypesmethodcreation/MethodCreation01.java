package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java'da method nasil olusturulur
    1)main methodun disinda class'in icinde olusturulur.
          1                  2               3         4        5
    2)Access modifier +  return type + Method ismi +  ()  +    {}
     */
    /*
    olusturulan methodlar nasil kullanilir?
    1)Method'u olusturmak methodu calistirmak icin yeterli degildir. Kullanmak istenen method main method'un icinde kullanilir.
    2)method'un ismini +() yazin.
    3)varsa islem yapacaginiz datalari parantezin icine koyun
      bu islem method call (method cagirma) olarak adlandirilir
    4)method name + parametreler ==> method signature
     */
    public static void main(String[] args) {
     int sonuc  =   toplamaYap(3,5);
     System.out.println(sonuc);
    long  carpma = multiply(5,12);
        System.out.println(carpma);
        System.out.println(  firstTwoMultiplyThirdAdd(2, 3, 4));

    }

    //ornek1: toplama islemi yapan method olushturunuz
    public static int toplamaYap (int a,int b) { //bu kisimda method kapsaminda kullanilmasini istedigim ve islenmesini istedigim datalari declare ediyoruz
       return a+b;
        //return demek bu methodun cagrildigi yere bu degeri return et demek
    }
    //main method static oldugu icin main method icinde kullandigimiz method static olmalidir

    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
    protected static long multiply (int v,int s) {
       return v*s;

    }
    //Ornek 3:
    private static int firstTwoMultiplyThirdAdd(int f, int d, int c){

        return f*d+c;
    }
    /*
    1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
    2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
     */
}

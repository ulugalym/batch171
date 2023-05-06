package day01variables;

public class Variables01 {
    public static void main (String[] args){
        //java bu satiri okumaz, kendimize ve baskalarina aciklama satiridir
        /*
        java bu satirlari da okumaz
         */
        //variable nasil olusturulur?
        // Data type+variable name + Assignment Operator(atama operatoru)+ Variable degeri +noktali virgul
           int           age                 =                                  13            ;
        System.out.println(age);

           //java cumlesi =>statement
        //Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gocsterir.
        //Eger variable declaration yapar, Assignment yapmazsaniz java kendi degerini koyar
        //Defoult deger sayilar icin sifirdir.
        //javad da "=" assignment operator dir. ve java bu operatoru gordugu zaman once sag tarafi calistirir.
        //ve sagdaki degeri alir soldaki kutuya koyar
        //java da esittir demek "==" Matemetikte "=", javada "==" seklindedir.
        //Data type + VariableName ==> Variable declaration
        //Assignment Operation (=) + Variable degeri ==> Assignment

        /*
        javada temelde iki type data vardir
            1) primitive data type:
               char, boolean, byte, short, int, long, float, double
            20 non-primitive data type:
               String
         */
        // Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Data type+variable name + Assignment Operator(atama operatoru)+ Variable degeri +noktali virgul
        String        ogrenciAdi       =                                    "Ali Can";
        System.out.println(ogrenciAdi);
        //String lere verilen degerler daima cift tirnak icinde yazilmalidir.
        //String ler icin "default value"(==>varsayilan deger) "null"dir
        /*
        string  bir variable olusturdugunuzda cogu zaman ona bir deger atariz.atama yapmazsak,
         java o variable  o varsayilan deger olarak null koyar.
         -null demek 0 demek degildir, o0 da coding de bir degetdir, null hiclik demekdir.
         icinde variable yada method bulunmayan bos bir abje demekdir
         */
        //char data type
        //tek karakterler icin kullanilir. sayi , sembol yada harf farketmez
        //ornegin==> A, X ?, 5, ....
        //ornek 2: char data typeinde bir isimn ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        char isminIlkHarfi ='A';
        System.out.println(isminIlkHarfi);

        //Note: char data type'inda degerler daima tek tirnak icinde yazilmalidir.

        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir: true (dogru) veya


        boolean isRetired =false;
        System.out.println(isRetired);

        //byte data type
        //tam sayilar icin kullanilir ve hafizada bir byte yer kaplar
        //byte : -128den +127'e kadar tam sayilari icin kullanilir.
        //ornek 4: byte data tipinde3 ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 18;
        System.out.println(ogrenciYasi);


        //short data type
        //tam sayilar icin kullanilir, hafizada 2 byte yer kaplar.
        //shoer: -32768den +32767'e kadar tam sayi  degerleri icin kullanilir.
        //ornek 5:Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1300;
        System.out.println(siteNufusu);

        //int data type
        //tam sayilar icin kullanilir, hafizada 4 byte yer kaplar
        //int : -2147,483,648 ile 2,147,483,647 (dahil) kadar tamsayi degerleri icin kullanilir
        //Ornek 6: Ulke nufuslari icin bir variable olusturun ve deger atamasi yapiniz
        int ulkeNufusu = 131313131;
        System.out.println(ulkeNufusu);

        //long data type
        //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar
        //long :  -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 kadar tamsayilari degerleri icin kullanilir
        //ornek 7: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: bir diger long ise sonuna "L"(tavsiye edilir) veya "l" konulur
        long cellNumberInHumanBodyL=485467775557757L;
        System.out.println(cellNumberInHumanBodyL);
        //Eger long'a atadiginiz deger int 'lerin araliginda ise sonuna "L" koymaya gerek yok
        //long
        long weightOfSun = 45754242;
        System.out.println(weightOfSun);


        //float data type : 4 byte yer kaplar
        //float virgullu sayilar icin kullanilir(fiyatlandirmada -12.99)
        //Ornek8: gomlek ve ayakkabi fiyatlari icin iki tane variable olusturun.
        //Java ondalikli sayilari otamatik olarak "double" kabul eder.
        //siz data type'ini  float yazarsaniz hata alirsiniz, flouat olmasinda israr ediyorsaniz sonuna "F", "f" koymalisiniz
        float shirtPrice=12.99f;
        float shoesPrice =15.99F;
        System.out.println(shirtPrice+shoesPrice);

        //double data type: 8 byte yer kaplar
        // ondalikli kismi icin daha fazla karam alabilir Hucre agirligi gibi bilimsel calismalarda kulllanilir

        //Ornek 9: Hucre agirligi ve Amip in agirligi icin iki tane variable olusturunuz

        double weihgtCell = 0.0000000000013;
        double weightAmip = 0.00000000000003;
        System.out.println(weihgtCell+weightAmip);

        //Ornek 10: ogranci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdiriniz.
        //--------------ekrana yazdirmak-------------------------------------------
        System.out.println(5);//ekrana yazdirir ve pointeri bir sonraki satira koyar
        System.out.print(13); //ekrana yazdirir ve pointeri ayni satirda tutar
        //---------------------------------------------------------------------

        byte note1 =50;
        byte note2 = 70;
        System.out.println(note1+note2);



        //Homework
        /*
        1) 3 data type'inde variable olusturun ve bunlari yazdirin
        2) ulke ve seher isimleri icin iki variable olusturun ve bunlari yazdirin
        3) iki tam sayi turunda veriable olusturup toplamini yazdirin
         */

    }
}

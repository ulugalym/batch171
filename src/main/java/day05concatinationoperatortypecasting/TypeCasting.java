package day05concatinationoperatortypecasting;

public class TypeCasting {
    /*
    Numerik primitive data type'larinin birbirine donusturulmesine "Type Casting" denilir
    Numeric (sayisal) primitive Data type'lar: byte - short - int - lonr - float - double
     */
    //Note1: Kucuk data type'larini buyuk data type'lerina cevirmeyi java otamatik olarak yapabilir
    //Bu isleme "AutoWidening" (otomatik genislemi) denir.
    //Note2:Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir,
    // java bu riskli isi otomatik olarak yapmaz, bu islemi kod yazanlar yaparlar
    //Bu isleme "EXPLICITNARROWING" (ACIKTAN DARALTMA) denir

    public static void main(String[] args) {
        //byte data type'ini int data type'ina ceviriniz
        byte age = 13;
        int ageInt=age;//AUTOWIDENING

        //int data type'ini short data type'ina ceviriniz
        int weight = 313;
        short weightShort=(short)weight; //EXPLICIT NARROWING
        //int data type'ini float data type'ina ceviriniz
        int population= 77000;
        System.out.println(population);
        float populationFloat= population;
        System.out.println(populationFloat);
        //double data type'ini short data typeina ceviriniz
        double number =12.99;
        System.out.println(number);
        short numberShort=(short)number;
        System.out.println(numberShort);

        //ornek
        short num=260;
        System.out.println(num);
        byte numByte=(byte)num;
        System.out.println(numByte);

        //Note: Donusum yaptiginiz sayi (260), donuseceginiz data type'inin sinirlari disinda ise
        //java kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur
    }
}

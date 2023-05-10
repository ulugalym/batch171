package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
         //primitive: char, boolean, byte, short, int, long, float, double
        // Wrapper Class :Chatacter, Boolean, Byte, Short,Integer,Long, Float, Double
        
        //wrapper class'lar non-primitive'dir. o yuzdan memory'de cok yer kaplar 
        //o yuzden sart degilse Wrapper class kullanmayi tercih etmeyiz
        //n yazip . koyarsaniz hic method goramazsiniz cunku primitive'ler method icermezler.
        int n=12;
        
        //m yazip nokta koyarsaniz bircok method gorursiniz, cunku wrapper class'lar method icerir.
        Integer m=12;
        
        byte p=13;
        Byte r=13;
        
        //ornek1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz
        short maxShort=Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767
        short minShort=Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768
        byte maxByte=Byte.MAX_VALUE;
        System.out.println("maxByte = " + maxByte);
        byte minByte=Byte.MIN_VALUE;
        System.out.println("minByte = " + minByte);
        float maxFloat=Float.MAX_VALUE;
        System.out.println("maxFloat = " + maxFloat);
        double maxDouble=Double.MAX_VALUE;
        System.out.println("maxDouble = " + maxDouble);

        //ornek2: int data type'inin minimum degeri ile byte data type'nin toplamini bulun
        int maxInt=Integer.MIN_VALUE;
        System.out.println("maxInt = " + maxInt);
        byte byteMax=Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        //Ornek 3: Primitive int'i Wrapper Integer'a ceviriniz(Autoboxing)
        int num=19;
        Integer wrapperNum=num;
        int d =24;
        Integer wrapperD=d;
        int c=23;
        Integer wrapperC=c;
        int s=12;
        Integer wrappers=s;

        //Ornek4: Wrapper byte primitive byte'a ceviriniz(Unboxing)
        Byte k=19;
        byte primitiveK=k;
        Byte h=34;
        byte primitiveH=h;
        Byte i=26;
        byte primitiveI=i;
        Byte t=32;
        byte primitive =t;

        //Ornek 5:Primitive char'i Wrapper Character'e ceviriniz(Autoboxing)
        char ilkharf='A';
        Character characterHarf=ilkharf;
        char initial='T';
        Character initialWrapper=initial;
        char isiminIlkHarfi='U';
        Character wrapperIlkHarf=isiminIlkHarfi;
        char dogumYilininIlkSayisi='2';
        Character wrapperIlkSayi=dogumYilininIlkSayisi;


        //ornek6:Wrapper Boolean'i primitive boolean'a ceviriniz(Unboxing)
        Boolean odev =true;
        boolean prOdev=odev;
        Boolean isOldWrapper=true;
        boolean isOld=isOldWrapper;
        Boolean yedim=false;
        boolean primitiveYedim=yedim;
        Boolean sevdimmi=false;
        boolean primitiveSevdimmi=sevdimmi;


    }
}

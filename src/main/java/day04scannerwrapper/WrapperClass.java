package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
         //primitive: char, boolean, byte, short, int, long, float, double
        // Wrapper Class :Chatacter, Booleaqn, Byte, Short,Integer,Long, Float, Double
        
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

    }
}

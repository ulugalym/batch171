package day02datatypesmethodcreation;

public class Tekrar01 {
    /*
   1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
   2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
    */
    public static void main(String[]args){
        int alan = dikdortgenAlan(4,8);
        System.out.println(alan);
        System.out.println(dikdortgenCevre((short)6,(short)8));
    }

    public static int dikdortgenAlan(int a, int b){
        return a*b;
    }
    public static short  dikdortgenCevre (short c,short d){
        return (short) ((short)2*(c+d));
    }
}


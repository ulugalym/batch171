package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {
        double kup= getCup(5);
        System.out.println("kup = " + kup);
        print("Java is easy");

        //method olusturmak icin ikinci yol
        //ornek2 ikinci yol :
        String str ="TechproEdu";
        //method ismi ve parametreleri yazariz
        printConsole(str);

        //ornek3:Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran method'u olusturup kullaniniz.
        int a=3;
        int b=5;
        carpmaYap(a,b);

        //ornek 4: verilen bir tamsayinin karesini hesaplayin konsole'a yazdiran method'u olusturup kullaniniz.
        int c=5;
        kareYap(c);
        int sayi=4;
        karesiniAl(sayi);
        karesiniAl(8);

    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);
    }

    private static void kareYap(int c) {

        System.out.println(c*c);
    }

    private static void carpmaYap(int a, int b) {

        System.out.println(a*b);
    }

    private static void printConsole(String str) {

        System.out.println(str);
    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz
     static double getCup(double a){
        return a*a*a;
       

    }
    //Note: Access modifier'i default yapmak istarsek access modifier'i yazmayiz.
    //ornek2: girilen
    public static void print(String str){
        System.out.println(str);

        //
        //

    }

}

package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1) "String builder':' classi da string ureten bir class'dir.
        2) String class kullanarak string uretiriz, nicin "String builder" classi da var?

             String immutable (degistirilemez) String uretir.
            "String builder" class mutable (degistirilebilir) String uretir.

        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
           "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir
            */
        //Immutable
        String s="Java";
        String t=s+"!";
        String w=t+"?";
        //String i degistirdikten sonra ayni string assign ederseniz, java yine yeni bir container olusturur.
        //degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a yonlendirir
        //Dolaysiyla eski container adressiz kalir, ve "Garbage Collecter" Adressiz olan container'leri siler
        String a ="Money";
        a=a+"More";
        //mutable
        //StringBuilder kullanarak String olusturmanin 1. yolu
        StringBuilder sb1=new StringBuilder("Python");
        System.out.println(sb1.capacity());
        sb1.append("!");
        System.out.println(sb1);
        //StringBuilder kullanarak String olusturmanin 2. yolu
        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");
        //capacity() ve legnth arasindaki fark nedir?
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        //capacity() javanin size verdigi data depolama yer sayisidir
        //length ise size verilewn data depolama yerinin kullanilan kismidir
        //Java baslangic olarak size capacity'i 16 olarak verir, eger siz verilen capacity asarsaniz
        //java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        //16==>16*2+2               34==>34*2+2
        //StringBuilder kullanarak String olusturmanin 3. yolu
        //default copacity i nasil degistirebiliriz?
        StringBuilder sb3=new StringBuilder(3);
        System.out.println(sb3.capacity());
        sb3.append("ali");
        System.out.println(sb3.capacity());
    }
}

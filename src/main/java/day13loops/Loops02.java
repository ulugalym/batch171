package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile bolunebilen tamsayilari ekrana yazdiriniz
        for (int i=21;i<181;i++){
            if(i%2==0&&i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //ornek 2: Size verilen kucuk harfle yazilmis String'in index'i
        // cift sayi olan characterlerini buyuk harfe donustiren kodu yazdiriniz
        // ankara ==> AKR
        String s="ankara";

        for(int i=0;i<s.length();i++){
           String ch=s.substring(i,i+1);
           if(i%2==0){
               System.out.println(ch.toUpperCase());
            }
        }
        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //"I love Java"==>"I love J"
        String s1="berber";
        for (int i=0;i<s1.length();i++){
                char ch=s1.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);

        }
        System.out.println();
        ///Ornek 4: Verilen bir string te son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //        //  "Germany"  ==>  yn
        String t="Germany";
        for (int i=t.length()-1;i>=0;i--){
            char ch=t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }
    }
}

package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
/*            3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30*/
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfan sayi giriniz");
        int num= input.nextInt();
        int i=1;
        while (i<11){
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        }
        //Example2:Verilen bir stringde her harfin sonrasina * sembolu ekleyiniz
        //Java==>J*a*v*a*
        System.out.println("bir kelime giriniz");
        String word= input.next();
        String newWord="";
        int s=0;
        while(s<word.length()){
            newWord+=word.charAt(s)+"*";
            s++;
        }
        System.out.println(newWord);
        String newWord1="";
        int a=0;
        while(a<word.length()){
            newWord1+=word.substring(a,a+1)+"&";
            a++;
        }
        System.out.println(newWord1);

        String sonuc="";
        int b=0;
        while (b<word.length()){
            char ch=word.charAt(b);
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                sonuc+=ch;
            }
            b++;
        }
        System.out.println(sonuc);
        String sonuc1="";
        int o=0;
        while(o<word.length()){
            String ch=word.substring(o,o+1);
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                sonuc1+=ch;
            }
            o++;
        }
        System.out.println(sonuc1);
        String d="kertenkelle";
    }
}

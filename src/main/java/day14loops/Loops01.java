package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //verilen bir string'i ters ceviren kodu yaziniz
        //"Java"==>"avaJ"
        //1. Yol
        String t="Ulugbek";
        String ters="";
        for (int i=t.length()-1;i>-1;i--){
            ters+=t.substring(i,i+1);
        }
        System.out.println(ters);
        //2.Yol
        String u="Java";
        String ters2="";
        for(int i=u.length()-1;i>-1;i--){
          ters2+=u.charAt(i);
        }
        System.out.println(ters2);
        //Ornek2: Size verilen bir string'in "Palindrome" olup olmadigini kontrol eden kodu yazdirin
        //nalan, ey edip adanada pide ey ,404
        //Logic : String i ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome"
        String duz="Ey edip adanada pide ye";
        String ters1="";
        for (int i=duz.length()-1;i>-1;i--){
            ters1+=duz.substring(i,i+1);
        }
        System.out.println(ters1);
        if(duz.equalsIgnoreCase(ters1)){
        System.out.println(duz+" : Palindrome dir");
        }else{
            System.out.println(duz+": Palindrome degildir");
        }
    }
}

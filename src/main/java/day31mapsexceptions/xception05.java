package day31mapsexceptions;

public class xception05 {
    public static void main(String[] args) {
        int a=12;
        int b=1;
        String s="Java";
        getCharFromString(s,a,b);
    }
    public static void getCharFromString(String s,int a,int b){
        try {
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
            System.out.println(e.getMessage());
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
            System.out.println(e.getMessage());
        }
    }
    /*
    Try kisminda birden fazla exception olusturma ihtimali olan kod varsa coklu catch kullanabilirsiniz
    coklu catch kullandiginizda exception class lar arasinda parent-child iliskisi yoksa catchlerin sirasi onemli degildir.
    Ama koddaki siralamaya uymak tavsiye edilir

    Coklu catch kullandiginizda exception classlar arasinda parent-child iliskisi varsa catchlerin sirasi onemlidir,
    child olan class ustte olmalidir.


     */
}

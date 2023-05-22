package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //Ornek 1: Ekrana 5 kere "Hi" yazdirin
        //1.yol tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        /*
        Code Standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dinamic olmalidir
        3)Tamir (Fix) ve update kolay yapabilmelidir.
         */

        //2.Yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir
        //Dort tane loop var a)for-loop b) while-loop c) do-while-loop d) for-each
        //a) for-loop
        /*
        for (Baslangic degeri ; Loop un calisma sarti ; Artirma/eksiltme){
            calisacak kodlar
            }
         *///i=i+i /i+=1/ i++
        //Baslangic Degeri ; Loop'un calisma sarti ; icrement/decrement
        for (int i=1;i<6;i++){
            System.out.println("Hi");
        }
        //Ornek 2: 11den 14e kadar tum sayilari ekrana yazdiran kodu yaziniz
        for(int i=11;i<15;i++){
            System.out.println(i);
        }
        //ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz.
        for (int i=40;i>22;i--){
           if(i%2==0){
               System.out.print(i);
           }
        }
        System.out.println();
        //ornek 4: 18den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.
        for (int i=18;i<57;i++){
            if(i%2!=0){
                System.out.print(i);
            }
        }

    }
}

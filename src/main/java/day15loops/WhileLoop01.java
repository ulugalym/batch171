package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        //kalibini olusturalim
 /*
        for (baslangic degeri ; loop calisma kurali ; artirma/azaltma) {
            calisacak kodlar
        }

        */
        /*while loop kalibi
        baslangic degeri
         while(loop calisma kurali ){
            calisacak kodlar
            artirma/azaltma
         }*/
        //ornek 1: 3-ten 6-a kadar tam sayilari console'a yazdiriniz
        //1.yol: for loop
        for (int i=3;i<7;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //2.yol:While loop
        int i=3;
        while(i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz
        int k=23;
        while(k>11){
            if(k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();
        int s=6;
        while(s<20){
            if(s%2!=0){
                System.out.print(s+" ");
            }
            s++;
        }
        System.out.println();
    }
}

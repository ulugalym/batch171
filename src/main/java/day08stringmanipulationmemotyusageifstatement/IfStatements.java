package day08stringmanipulationmemotyusageifstatement;

public class IfStatements {
    public static void main(String[] args) {
        //ifStatements
        //Bazi kodlari bazi sartlara gore aktive edebilmek icin if statements kullanilir
        //if eger demek ==>if cumlesi
        //if you study hard, you will learn Java.
      /*  if(you study hard){
            you will learn Java ==>java
        }
       */
       //Ornek 1:Sayi pozitif ise ekrana pozitif yazdirin
       int num=13;
       if(num>0){
           System.out.println(num+"==>pozitifdir");
       }
       //Ornek 2: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin
        // -1<n<10 ==> n>-1 && n<10
        int n=-5;
       if(n>-1 || n<10){
            System.out.println("Rakam");
       }
    }
}

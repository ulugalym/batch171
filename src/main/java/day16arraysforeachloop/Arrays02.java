package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example1: Strinjg array olusturun icine 5 tane eleman ekleyin ilk eleman ile
        // son eleman in icerdigi charakter sayisini ekrana yazdirin
        String arr[]=new String[5];
        arr[0]="Math";
        arr[1]="Sciennce";
        arr[2]="Music";
        arr[3]="Engilish";
        arr[4]="Atr";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length-1].length());
        //Exemple2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin ecerdigi karaqkter sayilari toplamini ekrana yazdirin
        String brr[]=new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";
        System.out.println(Arrays.toString(brr));
        //1.yol for loop
        int totalChar=0;
        for (int i=0;i< brr.length;i++){
            totalChar+=brr[i].length();
        }
        System.out.println(totalChar);
        //2.yol for each loop(enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/dicrement kismiinikendisi halleder.
        //for-each-loop "Array"lerde ve "collection"larda kullanilir
        /*for (DataType w :brr/collection){
            calisacak kodlar
        }*/
        int sum=0;
        for (String w:brr){
            sum+=w.length();
        }
        System.out.println(sum);
        //ornek 3: Notlar adina Integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdiriniz
        int notlar[]=new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;
        System.out.println(Arrays.toString(notlar));
        int toplam=0;
        for (int w:notlar ){
            toplam+=w;
        }
        System.out.println(toplam/notlar.length);
    }
}

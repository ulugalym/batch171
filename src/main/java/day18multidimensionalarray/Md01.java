package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //bir Arrayin elemanlari Array ise bu Arraylere Multidimensional Array dir.
        //Multidimensional Array nasil olusturulur
        int a[][]=new int[3][2];
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=0;
        //Multidimensional Array nasil yazdirilir
        System.out.println(Arrays.toString(a));//[[I@3ac3fd8b, [I@5594a1b5, [I@6a5fc7f7]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]
        //Multidimensional Array'leri yazdirmak icin toString () methodu degil,
        // deepToString() methodunu kullanmaliyiz.
        //Multidimensional Array icinden specific bir eleman nasil yazdirilir.
        System.out.println(a[1][1]);
        System.out.println(a[2][1]);

        //Multidimensional Array icindeki bir array nasil yazdirilir
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));//[81, 45]

        //Kisa yoldan Multidimensional Array nasil olusturulur?
        String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        System.out.println(Arrays.deepToString(students));//[[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan], [Ceyhan, Kayahan]]
        //Ornek 1:Yukardaki students arrayde kac isim oldugunu bulunuz
        int sum=0;
        for (String [] w: students){
            sum+=w.length;
            System.out.println(sum);
        }
        System.out.println(sum);//8
    }
}

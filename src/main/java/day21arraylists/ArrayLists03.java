package day21arraylists;

import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Kisa yoldan bir list nasil olusturulur?
        List<Character>initials=List.of('a','c','a','k');
        System.out.println(initials);
        // initials.add('b');
        //initials.set(0,'u');
        //initials.remove((Character) 'a');
        //List.of() methodu degistirilemez bir list olusturmak icin kullanilir,
        //bu nedenle list uzerinde degisiklik yapmaya yonelik methodlari desteklemez
        // ama deger list methodlari kullanabiliriz

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumun indexini verir
        int r1=initials.indexOf('a');
        System.out.println(r1);
        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorunumun indexini verir
        int r2=initials.lastIndexOf('a');
        System.out.println(r2);
    }
}

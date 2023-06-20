package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Gulce",30);
        stdAges.put("Abdullah",39);
        stdAges.put("Benna",33);
        stdAges.put("Hasan",30);
        stdAges.put("Suleyman",33);

        //key i tekrarli kullandigimizda hata vermez, en son verilen entry nin degerini kabul eder
        //Bu yontem value guncelleme icin kullanilabilir. Buna overwrite denir
        stdAges.put("Abdullah",24);

        //Map ler entryleri siralarken key lere bakarak siralama yapar
        //HashMap ler entry leri rastgele siralar bu yuzden cok hizli calisir
        System.out.println(stdAges);//{Hasan=30, Abdullah=24, Gulce=30, Benna=32, Suleyman=33}


        //replace() methodu value lari key ler kullanarak update etmeye yarar
        stdAges.replace("Hasan",35);
        System.out.println(stdAges);//{Suleyman=33, Hasan=35, Abdullah=24, Gulce=30, Benna=33}

        //replace("Gulce",30,35); methodu map icinde Gulce varsa ve degeri 30 ise yeni deger 35 olsun yoksa olmasin
        stdAges.replace("Gulce",30,35);
        System.out.println(stdAges);

        //putIfAbsent("Ali",18); method map de ali key olarak yoksa map e 18 value ile ekle demektir.
        stdAges.putIfAbsent("Ali", 18);
        System.out.println(stdAges);

        //get() ve getOrDefault() methodu eger aranan eleman mapte varsa ayni value yu verir
        System.out.println(stdAges.get("Abdullah"));
        System.out.println(stdAges.getOrDefault("Abdullah",0));
        //eger eleman mapte yoksa get() method null verir
        //getOrDefault() methodu sizin belirttiginiz degeri verir
        System.out.println(stdAges.get("Mehmet"));
        System.out.println(stdAges.getOrDefault("Mehmet",0));

        //containsValue(63) methodu mapin icindeki value larin icerisinde 63 olup olmadigini kontrol eder
        System.out.println(stdAges.containsValue(63));//false

        //containsKey("Seda") methodu mapin icindeki key lerin icerisinde "Seda" olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Seda"));

        //remove("Abdullah");methodu key kullanarak entry i silmeye yarar
        stdAges.remove("Abdullah");
        System.out.println(stdAges);

        //stdAges.remove("Ali",19); methodu hem key hem value yu kontrol eder eslesirse silme yapar.
        stdAges.remove("Ali",19);
        System.out.println(stdAges);
    }
}

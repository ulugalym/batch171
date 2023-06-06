package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*
        1) Ayni data type'indaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icinne koyacaginiz eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler, bu yuzdan java Arraylist adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
        1000 eleman koyarsaniz eleman sayisi 1000 olarak ayarlar
        4) Arraylist yerine sadece List de diyebilirsiniz
        5) Java Arraylistleri olusturdukdan sonra Array'leri iptal etmedi cunku:
        a) Array'leer super hizlidir.
        b) Array'ler memory'de cok az yer kaplar.
        c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6)Array'ler pirimitive data type'lari ve reference'lari depolayabilir.
        Ama ArrayList'ler non-primitive data type'lari depolar, bu nedenle Arraylestler Arraylerden daha fazla yer kaplar.
         */
        //ArrayList nasil olusturulur?
        ArrayList<Integer>ages=new ArrayList<Integer>();
        //Arraylist console'a nasil yazdirilir?
        System.out.println(ages);
        //Arraylistlere eleman nasil eklenir?
        //Arraylitslere eleman eklemek icin add() method'unu kullaniriz
        //add() method'u elemanlari sizin verdiginiz sirada "list"e ekler (insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);
        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir liste coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz
        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);
        ages.addAll(newAges);
        System.out.println(ages);
        ages.addAll(2,newAges);
        System.out.println(ages);
        //ArrayList te eleman sayisi nasil bulunur?
        //size() method'u bir list teki eleman sayisini verir
        int numOfElement=ages.size();
        System.out.println(numOfElement);
        //ArrayList'de specific bir eleman nasil alinir?
        //get() method'u index kullanarak istediginiz elemani almaya yarar
        int el1=ages.get(1);
        System.out.println(el1);
        //ArrayList'de specefic bir elemani nasil degistirebiliriz?
        ages.set(6,111);
        System.out.println(ages);
        ages.set(4,313);
        System.out.println(ages);
        //Bir List'de tum elemanlari nasil sile biliriz?
 //       ages.clear();
 //       System.out.println(ages);
        //ArrayList'de specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r=ages.contains(313);
        System.out.println(r);
        //Bir ArrayList'in bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu ArrayList bos ise true, bos degilse false return eder.
        boolean r2=ages.isEmpty();
        System.out.println(r2);
        //Ornek 1: Siza verilen bir list'in bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String>names=new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Ridvan");
        names.add("Enes");
        //1.way
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }
        names.clear();
        //1.way recommended
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }
        /*
        Bir method u ogrenirken asagdaki 3 seyi ogrenin:
         1) o method ne is yapar?
        2) o method nasil kullanilir?
        3) o method size neyi verir?
         */
    }
}

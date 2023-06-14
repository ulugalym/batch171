package day25inheritance;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle 1");
    }
    public Vehicle(int price){
        System.out.println("Vehicle 2");
    }
}
/*
1)Child classdan bir object olusturdugumuzda constructor en ustteki parent classtan
baslatilarak alta dogru calisitirilir
2)Child class taki constructor dan parent class daki constructor a gidebilmek icin super() kullanilir
3) parent class ta birden fazla construktor varsa istenilen construktor  super() ifadesinin icine yazilanparametreler yardimi
  ile secilebilir
4)Ayni class icindeki constructor i secmek icin this() kullanilir, Ayni class ta birden fazla constructor varsa istenilen
constructor this() ifadesinin parantez icine yazilan parametreler yardimi ile secebilir.
5) super() ifadesini yazmak istege baglidir, yazmassaniz da java sanki super() varmis gibi davaranir,
 Ama kodunuzun daha okunur kilmak icin yazmaniz tavsiye edilir
 6) super() ve this() ifadeleri bir constructor icinde her zaman ilk satirda olmalidir
 7) Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir.(Bakiniz 6.)
 8) Inheritance de variable ler ve methodlari cagirmak icin this veya super kullanilir
    this ayni class icindeki veriable veya methodlari cagirmak icin kullanilir
       super parent class icindeki variable veya methodlari cagirmak icin kullanilir
 */
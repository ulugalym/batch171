package day25inheritance;

    public class Animal  {
    /*
    Inheritance==> miras alma
    Ozellikleri bir classtan deger classlara alan bir kavramdir
    Mesela siz bir class olusturmak istiyorsunuz ama daha once olusturulmus bir class
    sizin istediginiz olzelliklerin cogunu kapsiyor. O zaman olusturdugunuz classi ozelliklerini kullanmak
    istediginizde class'a child yaparsiniz

    Inheritence'in faydalari
    1)Code tekrarlarindan kurtuluruz
    2)Code tamiri (maintenance) kolay olur
    3)Child classlari daha atomic yapmis oluruz

    =>Bire classi baska bir classin child classi yapmak icin
    extends keywordu kullanilir. ilk yazilan child, ikinci yazilan class
    parent olur, parent class'a super class da denir

     => child class objectleri parent class tan method ve variable lari kullanabilirler
     => Parent class objectleri child classtan method ve variablelari kullanamazlar

     =>javada bir classin sadece 1 tane parenti olabilir, coklu parent'a "Multiple Inheritance" derler,
     tekli parent'a "single inheritance" denilir. Java "Multiple"i desteklemez, Java single inheritance kullanir
     => Apartman seklindeki inheritance yapisina "MultiLevel Inheritance" denir, java multilevel inheritance i destekler
     => Object class her classin parentidir. java da object class haric her classin parenti vardir.
        Java da parent i olmayan tek class object classdir.

        =>Javada parent'den childa olan iliskilere "HAS-A Relation Ship" denir
        child'den parent'a olan iliskilere "IS-A Relation Ship" denir

        ==> javada her class in bir tane default constructoru vardit. bu default constructor classin icinde gorunmez

     */

        public void eat(){
            System.out.println("Animals eat...");
        }
        public void drink(){
            System.out.println("Animals drink");
        }
}

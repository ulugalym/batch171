package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {
        /*
        1) StringBuffer java da string ureten bir deger classtir.
        StringBuffer java nin string uretmek icin olusturdugu ilk classtir
        2)StringBuffer, StringBuffer'a cok benzer, yani ikiside "munable" string uretir.
        3)StringBuffer "multi-theard"dir ama StringBuilder "multi-thread"degildir.
        4)StringBuilder "multi-thread"olmadigi icin StringBuffer dan daha hizli calisir
        5)"multi-thread"yapilirkan yapilan islerin siralamasi onem arzeder,
        yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir.
        StringBuffer multi-thread oldugu icin ayni zamanda "synchronized"dir.

        3 tane String olusturan Class ogrendik:
          1)immutable String lazimsa: String Class
          2)mutable String lazimsa: StringBuilder veya StringBuffer
                   a)StringBuilderi"multi-thread" gerekirse kullaniriz
                   b)StringBufferi"multi-thread" gerekirse kullaniriz   */

        StringBuffer sbf=new StringBuffer("Java");
        System.out.println(sbf);
        System.out.println(sbf.capacity());
    }
}

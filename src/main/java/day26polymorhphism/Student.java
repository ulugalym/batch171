package day26polymorhphism;

public class Student {
    //Encapsulation ==> kapsulleme
    /*
    1)Encapsulation nedir? (DataHiding) veri saklamak.
    Data nasil saklanir?
    Access modifierlarini private yaparak datayi diger classlardan gorunmaz hale getiririm
    boylece datayi saklarim
    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    nasil okuruz? getmethod olusturarak Encapsulation edilmis datanin degerini okuyabiliriz

    1) get methodlar public olur
   2) get methodun return type okudugu variable in return type ile ayni olur
   3)get methodun boolean bir variable icin olusturulmus ise get method ismi is ile baslar

     */
    private String stdId="AC20230614";
    public String stdName="Ali Can";
    public int age=23;
    private double notOrt=3.53;
    private boolean succesful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }
//Encapsulation yapilan veriablenin data type eger boolean olsa
    public boolean isSuccesful() {
        return succesful;
    }
}

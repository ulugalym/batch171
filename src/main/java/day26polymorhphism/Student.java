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
     ornek=>isSuccessful()
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
    /*
    Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirilir?
    "set method" olusturarak Encapsulate edilmis datanin degerini degistirebiliriz
    1)set method hep public olur
    2)set method'larin return type'i hep void olur
    3)set method'lare parametre kullanir, parametrenin data type'i variable ile ayni olur

    NOTE 1: set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki
            yeni bir object'mis gibi kullanabiliriz
    NOTE 2: get methodlarinin diger bir adi getter, set method'larinin diger adi setter dir
            getter ve setter larin ikisine birden "Java Beans"   denir
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}

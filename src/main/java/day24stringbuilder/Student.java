package day24stringbuilder;

public class Student {

        /*
        Access Modifier
        1)public
        2)protected
        3)default (Access modifier i default yapmak icin access modifier yazmayiz)
        4)private

        Note: Access Modifier leri genisten dara dogru siralayiniz
        public > protected > default > private

        Note: public==> olanlar her class dan kullanilabilir
              protected ==> onallar baska packagew larden kullanilamaz,
              ama baska package da child class icinden kullanilabilir
              default ==> olanlar baska package den kullanilamazlar
              private ==> olanlar sadece olusturduklari class icinde kullanilabilir

        Note: "protected" ile "default" un farkini soyleyiniz?


         */
        //public her yerden kullanilabilir
        public String stdName="Ali Can";
        //protected olanlar baska package dan sadece child classlardan gorulur
        protected String address="Istanbul";
        //default olanlar baska package dan kullanilamaz
        String email="alican@gmail.com";
        //private olanlar sadece olusturulduklari class icinde kulllanilabilirler
        private String SsnId="123456789";

}

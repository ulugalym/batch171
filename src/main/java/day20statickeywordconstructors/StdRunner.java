package day20statickeywordconstructors;


public class StdRunner {
    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmak
        //sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);
        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1=new Student();
        System.out.println(std1.age);
        Student std2=new Student();

        Student.staticMethod();
        std2.nonStaticMethod();
        //object uzerinden de static class memberlara ulasabilirsiniz, tıpkı gokteki ay gibi
        //object uzerinden static class memberlara ulasmak tavsiye edilmez
        System.out.println(std1.stdName);
        std1.staticMethod();
    }
}

package day26polymorhphism;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.getStdId());//AC20230614
        System.out.println(s1.getNotOrt());//3.53
        System.out.println(s1.isSuccesful());//false
        System.out.println("=================================");
        s1.setStdId("MU1234567");
        s1.setNotOrt(4.99);
        s1.setSuccesful(true);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());
        System.out.println("==================================");
        s1.setStdId("VH1234567");
        s1.setNotOrt(1.25);
        s1.setSuccesful(false);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());
    }
}

package day32exceptions;

public class Exception02 {
    public static void main(String[] args) {
        //Birbirine donustirilemeyecek data type larini  donustirmekte israr ederseniz java ClassCastException atar
        Object obj=70;
        try {
            String str = (String) obj;
            System.out.println(str);
        }catch(ClassCastException e){
            System.err.println("Her data type i her data type ina ceviremezsin");
            System.err.println(e.getMessage());
        }
    }
}

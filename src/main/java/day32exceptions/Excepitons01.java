package day32exceptions;

public class Excepitons01 {
    public static void main(String[] args) {
        String s="Java";
        getNumberOfChars(s);
        String t="";
        getNumberOfChars(t);
        String u=null;
        getNumberOfChars(u);
    }

    //String in degeri null oldugunda String classdaki bazi methodlar kullanmaya calisirsaniz
    //Java NullPointerException atar.
    public static void getNumberOfChars(String s){
        try {
            int numOfChars=s.length();
            System.out.println(numOfChars);
        }catch(NullPointerException e){
            System.out.println("null degeri icin bazi methodlar kullanilamaz");
            System.out.println(e.getMessage());
        }
    }
}

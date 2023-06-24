package day32exceptions;

public class Exception03 {
   // throw keyword bir methodun body si icinde istedigimiz yerde, istedigimiz kosullar icin
   // istedigimiz kadar Exception atamamizi saglar.
   // throw keyword yazildiktan sonra bir exception class objecti olusturulur
   //
   //    Exception class constructor inin parantezi icine istediginiz Exception mesajini yazabilirsiniz
    public static void main(String[] args) {
        printAge(-63);
    }
    public static void printAge(int age){
       if(age<0){
         try{
             throw new IllegalArgumentException("Age cannot be negative");
         }catch(IllegalArgumentException e){
             System.out.println(e.getMessage());
         }
       }else{
           System.out.println(age);
       }
    }
}

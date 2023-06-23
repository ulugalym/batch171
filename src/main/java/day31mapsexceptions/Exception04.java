package day31mapsexceptions;

public class Exception04 {
    public static void main(String[] args) {
        String arr[]={"J","A","V","A"};
        getElementFromString(arr,1);
        getElementFromString(arr,5);
    }

    //Array lerde olmayan bir index kullanildiginda java ArrayIndexOutOfBoundsException atar
    public static void getElementFromString(String []s,int idx){
       try {
           String el = s[idx];
           System.out.println(el);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
           System.out.println(e.getCause());
       }
    }
}

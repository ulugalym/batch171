package day29collection;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
//        s.remove(2);
//        System.out.println(s);
//        s.remove("Bilal");
//        System.out.println(s);
//        s.removeFirstOccurrence("Nuriye");
//        System.out.println(s);
//        s.removeLastOccurrence("Nuriye");
//        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list
        Returns: the head of this list, or null if this list is empty
         */
        String r1=s.peek();//ilk node u silmeden size verir (copy+ paste)
        System.out.println(r1);//Nuriye
        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty.
         */
        String r2=s.poll();//ilk node size verir ve list ten siler (cut+paste)
        System.out.println(r2);//Nuriye
        System.out.println(s);//[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Return: the head of this list
        Throws: NoSuchElementException-if this list is empty
        Note: peek() ile element() ikiside ilk elemani silmeden verir
        ama peek() list bos oldugunda size null verir, element() ise hata verir.
         */
        String r3=s.element();
        System.out.println(r3);//Orhan
        System.out.println(s);//[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        //Note: poll() ile pop() ikiside ilk elemani siler ve size verir(cut+paste)
        //ama pol() list bos oldugunda size null verir,pop() ise hata verir
        String r4=s.pop();
        System.out.println(r4);//Orhan
        System.out.println(s);//[Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
    }
}

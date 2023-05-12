package day07Stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //ornek1: bir string'in bas ve sonunda space character'i varsa siliniz
        //   "  AliCan  "="Ali Can"
        String s= "  Ali Can  ";
        System.out.println("s = " + s);
        
        //trim() method'u bir string'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz 
        String sTrimmed=s.trim();
        System.out.println("sTrimmed = " + sTrimmed);

        //Ornek 2:Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //String tv = "$456.99"; String laptop = "$875.99";  ==>> 456.99 + 875.99 = 1332.98
        String tv="$456.99";
        String laptop="$875.99";
        String tv2=tv.replace("$",""), laptop2=laptop.replace("$","");
        double totalPrice= Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);

        //Ornek3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz
        //"   Ali Can "==> AC
        String name = " ali cAN  ";
        //split() methodu bir string'i istedigimiz karakleri parcalamaya yarar.

        char first=name.trim().toUpperCase().charAt(0);
        System.out.println("nameA = " + first);//A
        char last=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("last = " + last);
        System.out.println(""+first+last);
    }

}

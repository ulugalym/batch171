package day23datetimevarargs;

public class Varargs02 {
    public static void main(String[] args) {
        //Example2: Verilen isimlerin ilk harflerini konsole yazdiran kodu method'u olusturunuz.
        //         Ali Can===>AC Kemal Han==> KH
        getInitials("Ali Can","Kemal Han","Omer Can","Mehmet Tan");
    }
    public static void getInitials(String... s){
        String initials="";
        for(String w:s){
            initials=initials+w.charAt(0)+ w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials="";
        }
    }
}

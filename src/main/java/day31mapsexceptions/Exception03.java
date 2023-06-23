package day31mapsexceptions;

public class Exception03 {
    public static void main(String[] args) {
        String s="Java";
        getCharFromString(s,2);
        getCharFromString(s,4);
    }

    //String lerde var olmayan indexler kullanildiginda java StringIndexOutOfBoundsException atar
    // kisa yolu: ctrl+alt+t
    public static void getCharFromString(String s,int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanim hatasi yaptiniz..");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
             /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
            at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
            at java.base/java.lang.String.charAt(String.java:693)
            at day31mapsexceptions.E03.getCharFromString(E03.java:20)
            at day31mapsexceptions.E03.main(E03.java:9)
             */
            System.out.println("kod calismaya devam etdi");
        }
    }
}

package day33exceptionsenumsiterator;

public class EnumRunner {
    public static void main(String[] args) {
        //Enum daki bir sabite nasil ulasabiliriz?
        Cities bolu=Cities.BOLU;
        System.out.println(bolu);
        //Adana sabitinin ismine ulasalim
        String adanaCityName=Cities.ADANA.getCityName();
        System.out.println(adanaCityName);
        //Istanbul plaka koduna ulasalim
        int istanbulPlateCode=Cities.ISTANBUL.getPlateCode();
        System.out.println(istanbulPlateCode);
        //Ankara posta koduna ulasalim
        String ankaraPostaCode=Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostaCode);
    }
}

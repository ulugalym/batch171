package day02datatypesmethodcreation;

public class Variables01 {
    public static void main (String []args){
        //Ornek 1: sehir ismi icin bir variable olusturun ve once "Ankara "sonrada "Izmir"degeri atayip
        // ekrana yazdirin.
        String cityName = "Ankara";
        System.out.println(cityName);
        cityName = "Izmir";
        System.out.println(cityName);
        String sehirIsmi= "Dashoguz";
        System.out.println("sehirIsmi = " + sehirIsmi);
        sehirIsmi="Koheurgench";
        System.out.println(sehirIsmi);

        //Ornek 2: Sehir plaka kodu icin bir variable olusturun ve once "06" sonrada "35" degeri atayip
        // ekrana yazdirin
        byte plakaKodu = 06;
        System.out.println(plakaKodu);
        plakaKodu = 35;
        System.out.println(plakaKodu);
        String telNum="+99362175837";
        System.out.println("telNum = " + telNum);
        telNum="+99361393933";
        System.out.println("telNum = " + telNum);

        //Ornek 3: Basarili mi? sorusu icin bir variable olusturun ve once "false" sonrada "true" degeri atayip
        // ekrana yazdirin.
        boolean isSuccessful = false;
        System.out.println(isSuccessful);
        isSuccessful = true;
        System.out.println(isSuccessful);
        boolean onemli=true;
        onemli=false;
    }
}

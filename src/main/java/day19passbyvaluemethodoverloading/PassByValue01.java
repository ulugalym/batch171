package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //Note: Java "pass by value" sayesinde variable'larin orginal degerlerini korur
        int shirtPrice=100;
        //Java methoda gonderirkan orginal degeri degil kopyasini gondarir ve degisen deger kopya deger olur
        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(discount("senior", shirtPrice));//95
        //nolmalde indirim yaptik discount methodu ile ama burdaki deger hala orginal
        System.out.println(discount("adam", shirtPrice));//100
        System.out.println(shirtPrice);//100
    }
    //Discount Methodunu olusturalim
    public static int discount(String type, int price){
        switch(type){
            case "student":
                price-=10;
                break;
            case"veteran":
                price-=20;break;
            case"senior":
                price-=5;break;
            default:
                price=price;
        }
        return price;
    }
    /*
    Pass By Value:
    1) Java "Pass By Value" kullanir.
    2)Yani: Java methodlarin original degeri degistirmesine musade etmez
    3)Java method'lara deger yollarkan original degerin kopyasini olusturur.ve o kopyayi method a yollar
        Method kopya deger üzerinde degisiklik yapar, boylece orjinal deger korunmus olur
    4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 16

    Pass by reference:
    1)Pass by referance da method'a reference yollanir
    2)Reference adres demekdir. Address yollaninca method adresi kullanarak original degere ulasir ve original degeri degisir.
    Bu yuzdan "C#" gibi Pass By Reference kullanan dillerde method variable in orjinal degerini degistirir.
     */
}

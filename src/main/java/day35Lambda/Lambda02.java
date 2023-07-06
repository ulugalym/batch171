package day35Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        //removeIfLengthGreaterThanFive(myList);
        //removeIfElementsStartsWithZOrEndsWithF(myList);
        removeIfElementsStartsWithZOrEndsWithF1(myList);
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplicationFromThreeToNine());
        System.out.println(getMultiplicationFromThreeToNine1());
        System.out.println(getFactorial(5));
    }

    //7) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    public static void removeIfLengthGreaterThanFive(List<String>myList){
        myList.removeIf(t->t.length()>5);
        System.out.println(myList);
    }

    //8  ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.
    public static void removeIfElementsStartsWithZOrEndsWithF(List<String>myList){
        myList.removeIf(t->t.charAt(0)=='Z'||t.charAt(t.length()-1)=='f');
        System.out.println(myList);
    }
    //2.Yol:
    public static void removeIfElementsStartsWithZOrEndsWithF1(List<String>myList){
        myList.removeIf(t->t.startsWith("Z")||t.endsWith("f"));
        System.out.println(myList);
    }

    //9) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy(){
        return IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();

    }

    //10)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.yol
    public static int getMultiplicationFromThreeToNine(){
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    //2.yol
    public static int getMultiplicationFromThreeToNine1(){
        return IntStream.
                range(3,10).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //11)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if(x==0){
            return 1;
        }else if(x<0){
            System.out.println("Faktoriel islemi negativ sayilarla yapilamaz");
            return -1;
        }else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

}

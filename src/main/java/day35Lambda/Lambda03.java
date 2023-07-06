package day35Lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        System.out.println(getSumOfEvensBetweenTwoInt(9, 7));
        System.out.println(getSumOfEvensBetweenTwoInt1(9, 7));
    }

    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin
    // toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInt(int a,int b){
        if (a > b) {

            int temp=a;
            a=b;
            b=temp;

        }
            return IntStream.
                    range(a + 1, b).
                    filter(t -> t % 2 == 0).
                    sum();

    }
    public static int getSumOfEvensBetweenTwoInt1(int a,int b){

        return IntStream.
                range(Math.min(a,b),Math.max(a,b)).
                filter(Utils::isNumberEven).
                sum();

    }
}

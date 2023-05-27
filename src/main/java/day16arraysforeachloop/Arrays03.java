package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 1: Integer bir array olusturunuz, icine 6 tane eleman yerlestiriniz.
        //bu elemaanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.
        int ages[]=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));
        //1.yol sort() method'u array'deki elemanlari kucukten buyuge dizer.
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);
        //2.yol
        int minimum=ages[0];
        int maximum=ages[0];
        for(int w:ages){
            minimum=Math.min(minimum,w);
            maximum=Math.max(maximum,w);
        }
        System.out.println(minimum+maximum);
        //Ornek 2: String bir array olusturunuz ve 6 eleman yerlestiriniz yellew dan onceki elemanlari yazdiriniz
        String colors[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        System.out.println(Arrays.toString(colors));
        for(String w:colors){
            if(w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }
    }
}

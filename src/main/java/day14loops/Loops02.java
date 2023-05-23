package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek1: 5-dan 8-e kadar tamsayilarin toplamini veren kodu yazdiriniz
        //5+6+7+8==>26
        int sum=0;
        for (int i=5;i<9;i++){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println(sum);
        int num=0;
        for (int i=4;i<48;i++){
            num+=i;
        }
        System.out.println(num);
        //Ornek2: 7dan 9-a kadar tamsayilarin veren kodunu yaziniz
        //7*8*9=>504
        int multiply=1;
        for (int i=7;i<10;i++){
            multiply*=i;
        }
        System.out.println(multiply);
        int multiply1=1;
        for (int i=80;i<101;i++){
            if(i%10==0){
                multiply1*=i;
            }
        }
        System.out.println(multiply1);
        //Ornek 3: Verilen bir tam sayinin rakamlarini bulan kodu yazdiriniz.
        int toplam=0;int n=-578;n=Math.abs(n);
        for(int i=n;i>0;i/=10){
            toplam+=i%10;
        }
        System.out.println(toplam);
    }
}

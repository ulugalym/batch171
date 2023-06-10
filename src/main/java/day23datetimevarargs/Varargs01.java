package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add());

    }
    //NOte1: Bir method parantezinde birden fazla Varargs kullanilmaz
    //Note2: Eger bir method parantezinde birden fazla parametre kullanilacaksa Varargs sonda olmalidir

    public static int add(int b,int c,int... a){
        int sum=b+c;
        for (int w:a) {
            sum+=w;
        }
        return sum;
    }
    public static int add(int... a){
        int sum=0;
        for (int w:a) {
            sum+=w;
        }
        return sum;
    }

    //Asagdaki gibi farkli methodlar olusturarak is yapamayiz
    //Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir
    //her ihtimal icin bir method olusturmak mumkun degildir
    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs denir
    //Varargs arkada Array yapisini kullanir.


    //toplama islemi yapam bir method olusturun
//    public static int  add(int a,int b){
//        return a+b;
//    }
//    public static int add(int a,int b,int c){
//        return a+b+c;
//    }
//    public static int add(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
}

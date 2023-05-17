package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Increment
        int a=5;
        System.out.println("a = " + a);//5
        a=a+2;
        System.out.println("a = " + a);//7
        a+=2;
        System.out.println("a = " + a);//9
        //Ornek: Bir tane integer variable olusturun ve onu sekilde 5 artirin.
        int b=10;
        System.out.println("b = " + b);//10
        b=10+5;
        System.out.println("b = " + b);//15
        b+=5;
        System.out.println("b = " + b);//20
        //Decrement
        int c=8;
        System.out.println("c = " + c);//8
        c=c-3;
        System.out.println("c = " + c);//5
        c-=3;
        System.out.println("c = " + c);//2
        //Increment2
        int d=6;
        System.out.println("d = " + d);//6
        d=d*2;
        System.out.println("d = " + d);//12
        d*=2;
        System.out.println("d = " + d);//24
        //Decrement2
        int e=24;
        System.out.println("e = " + e);
        e=e/2;
        System.out.println("e = " + e);
        e/=2;
        System.out.println("e = " + e);
        //"1" ile increment
        int f = 12;
        System.out.println("f = " + f);//12
        f=f+1;
        System.out.println("f = " + f);//13
        f+=1;
        System.out.println("f = " + f);//14
        f++;
        System.out.println("f = " + f);//15
        //"1"ile Decrement
        int h=10;
        h=h-1;//9
        h-=1;//8
        h--;//7
        --h;
        System.out.println("h = " + h);
        //"post-increment" ve "pre-increment"
        int i=10;
        int k=i++;
        System.out.println("k = " + k);//k=10; post-increment i artirilmadan k'ya konuldugu icin "k"in degeri 10 olur
        System.out.println("i = " + i);//i=11
        int m=15;
        int n=++m;
        System.out.println("n = " + n);//n=16; pre-increment
        System.out.println("m = " + m);
        //ornek
        int p=17;
        int r=p--;
        System.out.println("r = " + r);
        System.out.println("p = " + p);
        int s=20;
        int t=--s;
        System.out.println("t = " + t);
        System.out.println("s = " + s);
        /*
        1)Increment artirmak demekdir, decrement azaltmak demekdir.
        2)increment toplama ve carpma ile,decrement cikarma ve bolme ile yapabilir
        a)i=i+5;
        b)i+=5;
        c)eger 1 ile artirma ==>i++
        note:bu c sikki sadece 1 artirmak icin kullanilir

                a)i=i-5;
                b)i-=5;
                c)eger 1 ile azaltma ==> i--
                note:bu c sikki sadece 1 azaltmak icin kullanilir
         */

    }
}

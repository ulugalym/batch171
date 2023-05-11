package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap : Yer degistirmek.
        //1.kap: Papates 2.kap: Domates==>swap=> 1.kap: Domates 2.kap: Patates
        int a =12;
        int b=5;//Swap'den sonra a=5, b=12
       // --------------------------------------------
        int g=13,s=12,kutu=0;
        System.out.println("g="+g+"\ns="+s);
        kutu=g;g=s;s=kutu;
        System.out.println("g="+g+"\ns="+s);
      //  --------------------------------------------
        int u=65,l=45,kap=55;
        System.out.println("u="+u+"\nl="+l);
        kap=u;u=l;l=kap;
        System.out.println("u="+u+"\nl="+l);
       // -------------------------------------------
        int y=5,i=6,canta=123;
        System.out.println("y="+y+"\ni="+i);
        canta=y;y=i;i=canta;
        System.out.println("y="+y+"\ni="+i);
        //------------------------------------------
        int t=4,n=9,kasa=20;
        System.out.println("t="+t+"\nn="+n);
        kasa=t;t=n;n=kasa;
        System.out.println("t="+t+"\nn="+n);
        //----------------------------------------
        int uzum=34,cherry=43,idis=2;
        System.out.println("uzum="+uzum+"\ncherry="+cherry);
        idis=uzum;uzum=cherry;cherry=idis;
        System.out.println("uzum="+uzum+"\ncherry="+cherry);
        //--------------------------------------------------



        int temp=0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //1.Yol: 1.Adim:
        temp=a;
        //2.Adim
        a=b;
        //3.Adim
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);

        //2.Yol
        int elma=12;
        int armut=5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma=elma+armut;
        armut=elma-armut;
        elma=elma-armut;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);
        //----------------------------------------------
        int d=45,f=55;
        System.out.println("d="+d+"\nf="+f);
        d=d+f;f=d-f;d=d-f;
        System.out.println("d="+d+"\nf="+f);
        //---------------------------------------------
        int e=34,w=43;
        System.out.println("e = " + e+"\nw = "+w);
        e=e+w;w=e-w;e=e-w;
        System.out.println("e = " + e+"\nw = "+w);
        //-----------------------------------------------
        int q=23,z=32;
        System.out.println("q = " + q+"\nz = "+z);
        q=q+z;z=q-z;q=q-z;
        System.out.println("q = " + q+"\nz = "+z);
        //---------------------------------------------
        int j=2,k=3;
        System.out.println("j = " + j+"\nk = "+k);
        j=3;k=2;
        System.out.println("j = " + j+"\nk = "+k);
        //=============================================
        int balik=7,tovuk=5;
        System.out.println("balik = " + balik+"\ntovuk = "+tovuk);
        balik=balik+tovuk;tovuk=balik-tovuk;balik=balik-tovuk;
        System.out.println("balik = " + balik+"\ntovuk = "+tovuk);
        //------------------------------------------------------
        int malEt=5,koyEt=8;
        System.out.println("malEt = "+malEt+"\nkoyEt = "+koyEt);
        malEt=malEt+koyEt;koyEt=malEt-koyEt;malEt=malEt-koyEt;
        System.out.println("malEt = "+malEt+"\nkoyEt = "+koyEt);

    }
}

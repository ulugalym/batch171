package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {
        String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        //ornek : Yukaridaki students arrayinde icinde "m" olan isimleri console a yazdiriniz
        for(String []w:students){
            for(String k:w){
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }
        //ornek 2: bir intiger multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayin
        int result=1;
        int nums[][]={{5,4},{2,3,2},{7}};
        for(int[]w:nums){
            for(int k:w){
                result*=k;
                System.out.println(result);
            }
        }
        System.out.println(result);

    }
}

package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        /*
        1)TreeMap "thread-safe" ve synchronized degildir.
           Note: Maplerde multi thread kullanmamiz gerektiginde sadece Hashtable kullanabilirsiniz
        2)TreeMap entry leri key lerine gore natural order a gore siralar. Bu yuzden cok yavastir
        3)TreeMaplerin keylerinde null kullanilamaz, ama value larinda istediginiz kadar kullanabilirsiniz
         */
        long t1=System.nanoTime();
        TreeMap<String, Integer>countryPopulations=new TreeMap<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherland",18000000);
        countryPopulations.put("Turkey",83000000);
        countryPopulations.put("Belgium",12000000);
        countryPopulations.put("Mexico",125000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",80000000);
        countryPopulations.put("Germany",85000000);
        System.out.println(countryPopulations);
        long t2=System.nanoTime();
        HashMap<String, Integer>countryPop=new HashMap<>();
        countryPop.put("USA",400000000);
        countryPop.put("Netherland",18000000);
        countryPop.put("Turkey",83000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",125000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",80000000);
        countryPop.put("Germany",85000000);
        System.out.println(countryPop);
        long t3=System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}

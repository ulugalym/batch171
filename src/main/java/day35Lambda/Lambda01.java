package day35Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        printElementsExceptStratsWithE(myList);
        System.out.println();
        printDistinctElLengthLessThanFive(myList);
        System.out.println();
        List<String>list=getElementsLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(list);
        printElementsLengthLessThanFiveUniqueWithLowerCase(myList);
        System.out.println();
        printElementsDistinctToUpperCaseSorted(myList);
        System.out.println();
        printElementsDistinctLowerCaseSortWithLength(myList);
    }

    //Example 1:Bir List'teki E ile baslayanlar haric tum elemanlari
    //    // console'a yazdiran method'u olusturunuz.
    public static void printElementsExceptStratsWithE(List<String>myList){
        myList.
                stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.print(t+" "));
    }

    ////Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    //    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.
    public static void printDistinctElLengthLessThanFive(List<String>myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.print(t+" "));
    }

    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari
    //buyuk harflerle bir listin icinde veren method'u olusturunuz.
    public static List<String> getElementsLengthMoreThanFiveWithUpperCase(List<String>myList){
       return myList.
               stream().
               filter(t->t.length()>5).
               map(t->t.toUpperCase()).
               collect(Collectors.toList());

    }
    //tavsiye edilir
    public static List<String> getElementsLengthMoreThanFiveWithUpperCase2(List<String> myList){
        return   myList.
                stream().
                filter(t->t.length()>5).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }

    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak
    // kucuk harflerle natural order da console'a yazdiran method'u olusturunuz.
    public static void printElementsLengthLessThanFiveUniqueWithLowerCase(List<String>myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(t->t.toLowerCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }
    public static void printElementsLengthLessThanFiveUniqueWithLowerCase2(List<String>myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(String::toLowerCase).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsDistinctToUpperCaseSorted(List<String>myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }
    public static void printElementsDistinctToUpperCaseSorted2(List<String>myList){
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElementsDistinctLowerCaseSortWithLength(List<String>myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));
    }

    //Tavsiye edilir.
    public static void printElementsDistinctLowerCaseSortWithLength2(List<String>myList){
        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);
    }

}

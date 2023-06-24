package day32exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception04 {
    /*
    1)Run button una basdikdan sonra console da alinan Exceptionlara "RuntimeException" denir.
      ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
      StringIndexOutOfBoundsException,...Runtime Exception lara ornekler
      Runtime Exceptionlara Unchecked Exception da denir.

    2)Code yazarkan kirmizi alt cizgi seklinde alinan Exception larda vardir, bunlarsa "Compile Time Exception" denir
      FileNotFoundException, IOexception Compile Time Exception lere ornekdir.
        Compile Time Exception lara Checked Exception da denir.

        throw ile throws keywordleri arasindaki fark nedir?
        1)throw method body si icinde throws ise method parantezinden hemen sonra kullanilir
        2)throw method bodysi icinde istenilen yerde istenildigi kadar kullanilir
           throws ise method parantezinden hemen sonra sadece bir kere kullanilabilir
        3)throw dan sonra new keyword ve constructor kullanilarak obje olusturulur
          throws dan sonra sadece Exception class ismi yazilir
        4)throw belli sartlar icin Exception firlatmada kullanilir
          throws ise bir methodun belli bir Exception u firlatabilecegini belirtmek icin kullanilir

     */
    public static void main(String[] args) throws IOException {

            FileInputStream fis=new FileInputStream("src/main/java/day32exceptions/file.txt");
            int k=0;
            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }

    }
}

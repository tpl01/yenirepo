package day_03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun

        Scanner girdi=new Scanner(System.in);
        System.out.println("ilk sayi giriniz");
        int sayi=girdi.nextInt();


        kacbasamak(sayi);


    }



    private static void kacbasamak(int sayi) {

        System.out.println(sayi>99?"ucden fazla":"ucden az");


    }
}

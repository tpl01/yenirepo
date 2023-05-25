package day_03;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner girdi=new Scanner(System.in);
        System.out.println("ilk sayi giriniz");
        int sayi1=girdi.nextInt();
        System.out.println("ikinci sayi giriniz");
        int sayi2=girdi.nextInt();

        //  String sonuc=sayi1>sayi2 ? "sayi1 buyuk":"sayi2 buyuk";
        //  System.out.println(sonuc);

        if(sayi1>sayi2){
            System.out.println("sayi bir daha büyük");
        }else if(sayi1==sayi2) {
            System.out.println("sayilar esit");}else {
            System.out.println("sayi 2 daha büyük");}



    }
}

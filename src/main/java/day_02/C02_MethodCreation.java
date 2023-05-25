package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
    //AMAC SCENNER VE METHOD olusturma

    public static void main(String[] args) {
        //kullanıcıdan veri alacaksak mutlaka scanner objesını olusturmalıyız
        Scanner girdi = new Scanner(System.in);

         // kullanıcıya mesaj ver
        System.out.println("Lutfen birinci sayıyı giriniz");

        //bu alinan veriyi konteynera koy
        int sayi1 = girdi.nextInt();

        //ikinci sayı icin mesaj
        System.out.println("Lutfen ikinci sayıyı giriniz");

        //ikinci sayiyi konteynera koy
        int sayi2 = girdi.nextInt();


        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //main method disindan cagirmak icin
        //isim verice KIRMIZI yanar tıkla altta method olusur(isim ver)
        swaplaYazdir(sayi1, sayi2);



    }

    public static void swaplaYazdir(int sayi1, int sayi2) {

        int sayi3 = sayi2;// hem sayi1 de hem de sayi3 de aynı deger var
        sayi2 = sayi1;
        sayi1 = sayi3;
        System.out.println("swap sonrası sayi1 = " + sayi1);
        System.out.println("swap sonrasi sayi2 = " + sayi2);


    }


}
package day_02;

import java.util.Scanner;

//kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını
// kontrol eden bir method yazınız
//yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner girdimiz = new Scanner(System.in);
        System.out.println("sayi 1 giriniz");
        int sayi1 = girdimiz.nextInt();
        System.out.println("sayi 2 gir");
        int sayi2 = girdimiz.nextInt();

        int sonuc=karetoplam(sayi1, sayi2);
        System.out.println(sonuc);
        boolean sonuc2=esitmibak(sayi1,sayi2);
        System.out.println(sonuc2);


    }

    private static boolean esitmibak(int sayi1, int sayi2) {
        return (sayi1*sayi1==sayi2*sayi2);

    }

    private static int karetoplam(int sayi1, int sayi2) {
        return (sayi1*sayi1+sayi2*sayi2);
    }



}









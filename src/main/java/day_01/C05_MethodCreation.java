package day_01;

public class C05_MethodCreation {

    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz 3 ve 5
    //main methodun içinde tanımladıgım iki sayının kareleri toplamını bulan ve yazdıran bır method olusturun
    public static void main(String[] args) {

        karetopla(3, 5);
        karetopla(10,100);
        karetopla(4,9);

    }


    public static void karetopla(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi1+sayi2*sayi2;
        System.out.println("sonuc = " + sonuc);


    }
}

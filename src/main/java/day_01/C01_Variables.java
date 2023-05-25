package day_01;

public class C01_Variables {


    public static void main(String[] args) {

        //Bir variable olustur, yazdır

        int yas = 32;
        int sayi = 50;
        System.out.println("yas = " + yas);  //yas. deyince gelir
        System.out.println(yas);             //sout de yas yaz
        System.out.println(yas);             //sout de yas yaz
        System.out.println(yas);             //sout de yas yaz
        System.out.println(yas);             //sout de yas yaz     //ctrl d aynısını yazar
        yas = 35;
        System.out.println("yas = " + yas);

        //sayi=50 seklinde yazdir

        System.out.println("sayi = " + sayi); //(sayi.) yaz gelsin ==> sayi=50 yazar

        // "sayi=" + sayi(yani 50 )   + ==> yanına yaz demektir  etiketiyle birlikte yazdırma demek
        // kod hizalama ==>>    crtl +alt + l

        System.out.println("yas = " + yas); //sout etiketsiz soutv etiketiyle

        //String bir variable olusturma
        //non primitive , büyük harfle baslar,"" arasina yazilir

        String isim="Ali";
        System.out.println("isim = " + isim);

        //farkli bir variable a kopyalama
        //benimYasim  ile yas ile esit olsun

        int benimYasim=yas;                                                           //camelCase
        String onunismi=isim;            //tırnaksiz yaz rakam gelsin
        System.out.println("onunismi = " + onunismi);
        System.out.println("benimYasim = " + benimYasim);

        //ayni satırda coklu deklere etme
        int yil=2023,ay=5,gun=5;
        System.out.println("yil = " + yil);

        //bir variable degeri güncelleme
        isim="Veli";                           // data type olmadan yaz String yok yani
        System.out.println("isim = " + isim);
        System.out.println("onunismi = " + onunismi);

        //Bir variable deklere et : x
        double x ;
        //Bir variable baslat : y
        double y=12.5;
        //Başka bir variable başlat : z
        double z=52.444;
        double h=3;    //java bunu 3.0 okur
        //x degişkenini y degişkeni ile başlat
         x=y;
        //Variable y'i guncelle
        y=14.4;   // nokta kullan
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        //Degişkenleri yazdır



    }


}

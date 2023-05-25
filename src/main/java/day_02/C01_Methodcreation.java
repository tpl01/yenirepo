package day_02;

import java.util.Scanner;

public class C01_Methodcreation {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        //kullancan bir fahrenayt deger al
        //SCANNER obje olustur


        Scanner girdilerimiz = new Scanner(System.in);
        //kullanıcıya bir mesaj ver

        System.out.println("lütfen fahrenayt degeri yaziniz");

        double fahrenayt=girdilerimiz.nextDouble();
        double celcius=fahrToCels(fahrenayt);           //bunu yazınca method olusturur main disinda
        System.out.println("fahrenayt = " + fahrenayt);
        System.out.println("celcius = " + celcius);

    }

    private static double fahrToCels(double fahrenayt) {
        //formül: c = (f-32)/1.8
         return ((fahrenayt - 32) / 1.8);


    }
       //        disarda kendimiz olustururken bu yoll
        //     public static double=fahreToCelsi(double fahrenayt){
       //           double sonuc=(fahrenayt-32)/1.8;
       //          return sonuc;


}


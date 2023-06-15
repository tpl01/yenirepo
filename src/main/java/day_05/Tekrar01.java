package day_05;

import java.util.Scanner;

/*
           Kullanıcıdan sisteme satır sayısını ve karakter girmesini isteyiniz.
           ve ardından kullanıcının girdiği karakteri kullanarak ikizkenar dik üçgen çizen
           bir method olusturun

           Satır sayısı = 4
           girilen karakter * ==>      *
                                       * *
                                       * * *
                                       * * * *
           */
public class Tekrar01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satır sayısını giriniz");
        int satir=scan.nextInt();

        System.out.println("Lutfen kullanmak istediğiniz karakteri giriniz");
        char krktr=scan.next().charAt(0);

        ucgen(satir,krktr);
    }

    private static void ucgen(int satir, char krktr) {



        for (int i=0;i<=satir;i++){
            for (int k=0;k<=i;k++){
                System.out.print(krktr+" ");
            }
            System.out.println();
        }
    }


}

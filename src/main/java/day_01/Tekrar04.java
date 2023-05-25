package day_01;

import java.util.Scanner;

public class Tekrar04 {

    //ücgenin verilmeyen iç açısını hesaplayan bir kod yaziniz ve yazdiriniz

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("ilk aciyi giriniz");
        int akenari = girdi.nextInt();
        System.out.println("ikinci aciyi giriniz");
        int bkenari = girdi.nextInt();
        int ckenar=180-akenari-bkenari;
        System.out.println("ckenar = " + ckenar);


    }


    }











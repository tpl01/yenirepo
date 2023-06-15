package day_05;

import java.util.Scanner;

/*
   Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
   ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

   örnegin: Satır Sayısı 4 icin;

    1
    2 3
    4 5 6
    7 8 9 10

    */
public class Tekrar02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satır sayısını giriniz");

        int ucgen=1;
        int satir=scan.nextInt();
        for(int i=1;i<=satir;i++){
            for (int a=1;a<=i;a++){
                System.out.print(ucgen+" ");
                ucgen++;
            }
            System.out.println();
        }

    }
}

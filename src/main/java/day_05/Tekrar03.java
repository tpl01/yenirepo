package day_05;

import java.util.Scanner;

// Kullanıcıdan sisteme bir sayi girmesini isteyiniz
// kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
//or: 5!=1*2*3*4*5
public class Tekrar03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi=scan.nextInt();

        int bas=1;
        int car=1;
        while (bas<=sayi){
            car*=bas;
            bas++;
        }
        System.out.println(sayi+"!="+car);
    }
}

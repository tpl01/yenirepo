package day_05;

import java.util.Scanner;

// Kullanıcından sisteme bir sayi girmesini isteyiniz,
// kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
public class Tekrar04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi=scan.nextInt();
       while (sayi%10!=0){
           System.out.print(sayi+" ");
           sayi++;
       }
    }
}

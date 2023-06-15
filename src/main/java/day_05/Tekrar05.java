package day_05;

import java.util.Scanner;

/*
   Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
   Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
   Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
   Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
   */
public class Tekrar05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yukseklik giriniz");
        int yuk=scan.nextInt();
        int yol=0;
        int zip=0;
        do{
            yol+=yuk;
            zip++;
            yol+=yuk/2;
            yuk/=2;
        }while (yuk>=1);
        if(yuk<1){
            yol-=yuk;}else {yol+=yuk;zip++;}
        System.out.println("yol"+yol);
        System.out.println("zip"+zip);
    }
}

package day_05;

import java.util.Arrays;
import java.util.Scanner;

// Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
// ve bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdırınız
// Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
// Ortalamadan daha buyuk olan array elemanlarını yazdırınız
public class Tekrar06 {
    public static void main(String[] args) {
        int a[]=new int[4];
        Scanner scan=new Scanner(System.in);
        System.out.println(Arrays.toString(a));           //[0, 0, 0, 0]

        for(int i=0;i<a.length;i++){
            System.out.println("bir sayi giriniz");
            a[i]=scan.nextInt();
        }
        int top=0;
        for(int w:a){
            top+=w;

        }
        System.out.println(top/a.length);

    }
}

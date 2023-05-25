package day_02;
         /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
import java.util.Scanner;

public class C02TEKRAR {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("lütfen sayi1 gir");
        int sayi1=girdi.nextInt();
        System.out.println("lütfen sayi2 gir");
        int sayi2=girdi.nextInt();
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        swaplama(sayi1,sayi2);




    }

    private static void swaplama(int sayi1, int sayi2) {

        int bos=sayi1;
        sayi1=sayi2;
        sayi2=bos;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    }
}

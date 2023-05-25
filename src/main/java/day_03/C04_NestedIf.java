package day_03;

import java.util.Scanner;

public class C04_NestedIf {
    public static void main(String[] args) {
        //Kullanıcıdan sisteme bir numara girmesini isteyin.
        //Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.
        //Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        //10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.
        Scanner girdi=new Scanner(System.in);
        System.out.println("ilk sayi giriniz");
        int sayi1=girdi.nextInt();
        if(sayi1<0){
            System.out.println("negatif");}else if(sayi1>0){if(sayi1<10){
            System.out.println("pozitif rakam");}if(sayi1>=10){
            System.out.println("pozitif sayi");}
        }

    }
}

package day_02;

import java.util.Scanner;

public class Scannerornek1 {
    //sisteme girilen 4 basamkli sayinin ilk 2 sayi topla ve son 2 basmagini bulup topal ve bunları carp
    //8576
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("sisteme 4 basamaki bir sayi giriniz");
        int girilen=girdi.nextInt();

        int num4=girilen%10;
        girilen=girilen/10;

        int num3=girilen%10;
        girilen=girilen/10;

        int num2=girilen%10;
        girilen=girilen/10;

        int num1=girilen%10;
        girilen=girilen/10;

        System.out.println((num1+num2)*(num3+num4));
        System.out.println(num1+num2+num3+num4);
    }
}

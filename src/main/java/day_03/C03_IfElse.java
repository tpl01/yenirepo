package day_03;

import java.util.Scanner;

public class C03_IfElse { //kullanıcıdan iki sayı isteyin
    //sayıların ikisi de pozitifse sayıların toplamını yazdırın
    //ikisi de negatifse sayıların çarpımını yazdırın
    //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
    //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("ilk sayi giriniz");
        int sayi1=girdi.nextInt();
        System.out.println("ikinci sayi giriniz");
        int sayi2=girdi.nextInt();

        if(sayi1>0&&sayi2>0){
            System.out.println(sayi1+sayi2);}else if
        (sayi1<0&&sayi2<0){
            System.out.println(sayi1*sayi2);}else if
        ((sayi1>0)&&(sayi2<0)||(sayi1<0)&&(sayi2>0)){
            System.out.println("farkli sayi islem yapamam");} else if
        (sayi1==0||sayi2==0){                                        //buna gerek yoktur aslında
            System.out.println("sifir yutan elemandir");}







    }
}

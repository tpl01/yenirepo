package day04;

import java.util.Scanner;

public class C02_NestedTernary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
        Scanner input=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char ch=input.next().charAt(0);

        System.out.println((ch<='z' && ch>='a')||(ch<='Z'&&ch>='A')?((ch<='z' && ch>='a')?"kucuk":"buyuk"):("harf degil"));

        boolean b = ch >= 'A' && ch <= 'Z';
        boolean c=ch<='z'&& ch>='a';
        {if(b){
            System.out.println("büyük");}if(c){
            System.out.println("kucuk");}if (!b&&!c){
           System.out.println("harf degildir");}


        }


    }
}

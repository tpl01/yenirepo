package day04;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
           /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next().toLowerCase();
        int sayac=0;        //a harfi için
        for(int i=0;i<kelime.length();i++){
            if(kelime.charAt(i)=='a'){sayac++;
            }else if(kelime.charAt(i)=='c')break;
        }
        System.out.println("ilk c ye kadar kelimenizde a harfleri sayisi= "+sayac);





    }
}

package day04;

import java.util.Scanner;

public class C01_NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayi");
        int ilk= input.nextInt();
        System.out.println("ikinci sayi");
        int iki=input.nextInt();

        if(ilk==iki){
            System.out.println("sayilar esit");}if(ilk!=iki){
                System.out.println("ilk");
            }

        System.out.println();

        System.out.println(ilk==iki?("esitler"):(ilk>iki?ilk:iki));
    }
}

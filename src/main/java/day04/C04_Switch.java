package day04;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

              seviyesini yazdırınız

       switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz

             harf notunu yazdırınız
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 0-4 arası puan giriniz");
        double puan=scan.nextDouble();
        String seviye="";
        if(!(puan>0&&puan<4)){
            System.out.println("lütfen 0-4 arasi giriniz");}else if(puan<1){seviye="kaldi";}else if(puan<2){
            seviye="gecti";}else if(puan<2.5){seviye="iyi";}else if(puan<3.5){seviye="üst";}else {seviye="harika";}

       switch (seviye){case "kaldi":
           System.out.println("F");break; case "gecti":
           System.out.println("D");break; case "iyi":
           System.out.println("C");break; case "üst":
           System.out.println("B");break; case "harika":
           System.out.println("A");}






    }
}

package day_04;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
        // Kullanıcıdan uc basamaklı bir sayı sisteme girmesini isteyiniz
        // Bu sayıyı okunuşuna çeviren bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz");
        int sayi=scan.nextInt();


        if(!(sayi>99&&sayi<1000)){
            System.out.println("üc basamakli giriniz");
        }else {
            int birler=sayi%10;
            int onlar=(sayi/10)%10;
            int yuzler=sayi/100;

            switch (yuzler){
                case 1:
                    System.out.println("yuz");break;
                case 2:
                    System.out.println("ikiyuz");break;
                case 3:
                    System.out.println("ucyuz");break;
                    case 4:
                    System.out.println("dortyuz");break;case 5:
                    System.out.println("besyuz");break;case 6:
                    System.out.println("altıyuz");break;case 7:
                    System.out.println("yediyuz");break; case 8:
                    System.out.println("sekizyuz");break; case 9:
                    System.out.println("dokuzyuz");break;

            }
            switch (onlar){case 1:
                System.out.println("on");break;
                case 2:
                    System.out.println("yirmi");break;
                case 3:
                    System.out.println("oyuz");break;
                case 4:
                    System.out.println("kırk");break;case 5:
                    System.out.println("elli");break;case 6:
                    System.out.println("altmıs");break;case 7:
                    System.out.println("yetmis");break; case 8:
                    System.out.println("seksen");break; case 9:
                    System.out.println("doksan");break;

            }
            switch (birler){case 1:
                System.out.println("bir");break;
                case 2:
                    System.out.println("iki");break;
                case 3:
                    System.out.println("uc");break;
                case 4:
                    System.out.println("dort");break;case 5:
                    System.out.println("bes");break;case 6:
                    System.out.println("altı");break;case 7:
                    System.out.println("yedi");break; case 8:
                    System.out.println("sekiz");break; case 9:
                    System.out.println("dokuz");break;



            }





        }


    }
}

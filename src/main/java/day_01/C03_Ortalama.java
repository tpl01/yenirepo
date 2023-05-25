package day_01;

public class C03_Ortalama {

    public static void main(String[] args) {
      /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;
        //stringde + yanyana dır
        //numaralarda + toplama yapar (numarik)

        double toplam=num1+num2+num3+num4+num5;
        System.out.println("toplam = " + toplam);
        double ortalama=toplam/5;
        System.out.println("ortalama = " + ortalama);


    }
}
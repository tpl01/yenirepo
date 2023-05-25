package day_01;

public class Tekrar {
    //ücgenin cevresini hesaplama 3 4 5


    public static void main(String[] args) {

        int sonuc=cevre(4,4,5);
        System.out.println("sonuc = " + sonuc);


    }
    public static int cevre(int kenar1,int kenar2,int kenar3) {
        return (kenar1+kenar2+kenar3);

    }


}
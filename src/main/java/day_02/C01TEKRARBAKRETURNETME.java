package day_02;

import java.util.Scanner;

public class C01TEKRARBAKRETURNETME {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("sisteme fahrenayt gir");
        double fahrenayt= girdi.nextDouble();

        double celcius=fahtocel(fahrenayt);
        System.out.println(celcius);








    }

    private static double fahtocel(double fahrenayt) {
        return (fahrenayt-32)/1.8;                        //   *******




    }


}




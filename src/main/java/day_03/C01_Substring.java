package day_03;

import java.util.Locale;
import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {
        //kullanıcıdan da ve soyadını arada bir bosluk olacak şekilde iste
        //ad ve soyadı ilk harfleri buyuk olacak sekilde alt alta

        System.out.println("isim soyisim giriniz");
        Scanner girdi=new Scanner(System.in);
        String adsoyad=girdi.nextLine();
        int space=adsoyad.trim().indexOf(" ");
        String ad=adsoyad.substring(0,space);
        String soyad=adsoyad.substring(space+1);
        char adilk=ad.toUpperCase().charAt(0);
        char soyadilk=soyad.toUpperCase().charAt(0);
        String adkaln=ad.substring(1).toLowerCase();
        String soyadkalan=soyad.substring(1).toLowerCase();

        System.out.println("ad="+adilk+adkaln+"\n"+"soyad="+soyadilk+soyadkalan);









    }

}

package day_01;

 public class C06_MethodCreation {

  public static void main(String[] args) {

   //kare prizma hacmi bulan döndüren bir method yazın a*a*h
   int tabanKenari=3;
   int yukseklik=4;


   kareprizmahacimbul(3,4);
   System.out.println("kareprizmahacimbul() = " + kareprizmahacimbul(3,4));
   System.out.println("kareprizmahacimbul() = " + kareprizmahacimbul(5,4));
   System.out.println(kareprizmahacimbul(tabanKenari, yukseklik));


  }
  public static int kareprizmahacimbul(int tabanKenari,int yukseklik){
   return tabanKenari*tabanKenari*yukseklik;



  }

}
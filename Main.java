import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int pomocnicza ;
    int sterowanie = 0;
    
 Random generator = new Random();
 pomocnicza = (generator.nextInt(101));
 System.out.println( "liczba :" + pomocnicza);
    do{
  System.out.println( "Podaj liczbę :");
  int liczba = sc.nextInt();
  if(liczba==pomocnicza){System.out.println( "Zgadłeś liczbę :");sterowanie = 1;}
  else{System.out.println("Nie zgadłeś liczby :");}
      }while(sterowanie !=1);
  }
}
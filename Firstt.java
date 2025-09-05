import java.util.Scanner;

public class Firstt {
  public static void main(String[] args) {
    Scanner ip =new Scanner(System.in);
    System.out.println("enter the year");
      int year=ip.nextInt();
      if(year%2==0){
        System.out.println("it is leap year.");
      }else{
        System.out.println("it is ordinary year.");

      
      }


  }
}
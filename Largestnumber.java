import java.util.Scanner;
public class Largestnumber { 
  public static void main(String[] args) {
    Scanner ip =new Scanner(System.in);
    System.out.println("enter the values of a and b");
     int a= ip.nextInt();
     int b=ip.nextInt();
     if(a>b){
      System.out.println("a is the largest number");
     }else
     {
      System.out.println("b is largest number");
     }

  }
  
  
}

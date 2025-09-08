import java.util.Scanner;


public class Prism {
  public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter the value of base:");
  double base=in.nextDouble();
  System.out.print("enter the value of height:"); 
  double  height=in.nextDouble();
  double volume=base*height;
  System.out.println("the value of volume of prism " +" " + volume +" units^3");
  }

}

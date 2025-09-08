import java.util.Scanner;


public class Triangle {
  public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter the value of base:");
  double base=in.nextDouble();
  System.out.print("enter the value of height:"); 
  double  height=in.nextDouble();
  double area=0.5*base*height;
  System.out.println("the value of area of triangle" +" " + area +" cm\u00B2");
  }

}

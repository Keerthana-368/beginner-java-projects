import java.util.Scanner;


public class Circle {
  public static void main(String[] args) {
    double pi=3.14;
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the value of radius:");
    double  r=in.nextDouble();
    double area=pi*r*r;
    System.out.println("the value of area of circle" +" " + area +" cm\u00B2");
  }

}

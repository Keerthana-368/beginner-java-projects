import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number");
    double number=in.nextDouble();
    System.out.println("enter the power number");
    double power=in.nextDouble();
    double whole=Math.pow(number,power);
   System.out.println(whole);

  }
}

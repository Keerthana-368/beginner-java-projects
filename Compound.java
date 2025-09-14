import java.util.Scanner;

public class Compound {
public static void main(String[] args) {
  Scanner in =new Scanner(System.in);
  System.out.println("enter the amount");
      float amount=in.nextInt();
      System.out.println("enter the interest");
      float interest=in.nextFloat();
      System.out.println("enter the compound interest");
      float compound=in.nextFloat();
      System.out.println("enter the numbe of years");
      float year=in.nextInt();
      double total = amount * Math.pow(1 + interest / compound, compound * year);
      System.out.println(total);
  }
  
}
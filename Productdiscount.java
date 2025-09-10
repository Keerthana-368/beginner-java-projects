import java.util.Scanner;

public class Productdiscount {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("enter the product price:");
    float price=in.nextFloat();
    System.out.print("enter the discount of the product:");
    float disc=in.nextFloat();
    // float disc=0;
    if (price>0) {
      float discount=price*disc/100;
      System.out.println(discount);
      
    }
  }
}

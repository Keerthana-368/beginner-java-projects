import java.util.Scanner;

public class Commissionpercentage {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("enter the product price");
    int  amount= in.nextInt();
    float percentage=in.nextFloat();
    while (amount>5000) {
      float commision=amount*percentage/100;
        System.out.println("the commission on the product is"+ commision);    
        break;
    }
     

  }
}

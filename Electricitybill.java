import java.util.Scanner;

public class Electricitybill {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("enter the units comsumed from user:");
    double  units=in.nextDouble();
    double amount=4;
    if(units>0){
      double bill=units*amount;
      System.out.println(bill+"Kwh");
    }else if (units==0) {
      System.out.print(75);
    }{ 

    }

    }

  }


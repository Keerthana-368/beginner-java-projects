import java.util.Scanner;

public class Tables {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the  number:");
    int number=in.nextInt();
    if (number>0) {
      for (int i = 1; i<=10; i++) {
        int result=number*i;
        System.out.println(number+"*"+i+"="+result);
      }
    }
  }
}
    
   
      


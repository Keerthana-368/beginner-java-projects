import java.util.Scanner;

public class Factor {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int factor=in.nextInt();
    int n=1;
    while(factor>=n){
      if(factor%n==0){
      System.out.println(n);
    }
    n++;
  }
    
        

      


    
    }
  }

  


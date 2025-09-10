import java.util.Scanner;

public class Average{
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=in.nextInt();
    
    
    if (n>0) {
    for (int i = 1; i <=n; i++) {
    int sum=i;
    sum++;
    if (i==n) {
    int average  = sum/2;
    System.out.println(average);
    }

    
    }
       
    }
    }
   
      }
     
    
  

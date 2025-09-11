import java.util.Scanner;

public class Perfectnumber {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number");
    int number=in.nextInt();
    int originalnumber=number ;
     int sum=0;
    if (number>0) {
      for (int i = 1; i<=number; i++) {
      if(number%i==0){
       sum=i;
      sum++;
      }
      
    }
    
  }
  if (originalnumber==sum) {
        System.out.println(originalnumber+" is"+" "+"perfect number");
      }else{
        System.out.println(originalnumber+" is"+" " +"not perfect number");
      }
}
}


  
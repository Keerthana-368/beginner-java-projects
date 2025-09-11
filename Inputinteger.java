import java.util.Scanner;
public class Inputinteger {
  public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      
      System.out.println("enter the number");
      
      int sum=0;
     while (true) {
      int number=in.nextInt();
      if (number==0) {
        break;
      }
        sum+=number;
      }
      System.out.println(sum);
     }
    }
  

      
// import java.util.Scanner;

// public class SumUntilZero {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int number;
//         int sum = 0;

//          System.out.println("Enter numbers (0 to stop):");
//         while (true) {
//         int    number = sc.nextInt();
//             if (number == 0) {
//                 break;
//             }
//             sum += number;
//         }

//         System.out.println("Sum of all numbers: " + sum);
//     }
// }
  
  

      
      

// import java.util.Scanner;

import java.util.Scanner;

public class Vowels {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("enter letter");
    char letter=in.next().trim().charAt(0);
    if (letter=='a' || letter=='e' || letter=='i'|| letter=='o' || letter=='u') {
      System.out.println("it is vowel");
    }else{
      System.out.println("it is consonant");
    }
  }
}

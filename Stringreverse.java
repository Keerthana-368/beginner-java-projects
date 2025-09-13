import java.util.Scanner;


public class Stringreverse {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("enter the name or anything");
    String name=in.nextLine();
  StringBuilder sb=new StringBuilder(name);
  sb.reverse();
System.out.println(sb);
  }
}

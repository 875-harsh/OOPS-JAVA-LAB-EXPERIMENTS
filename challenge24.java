import java.util.Scanner;

public class challenge24 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number1:");
    int number1=input.nextInt();
    int result= ~ number1;
    System.out.println("RESULT OF BITWISE ~ OPERATOR:"+result);
  }
  
}

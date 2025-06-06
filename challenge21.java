import java.util.Scanner;

public class challenge21 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number1:");
    int number1=input.nextInt();
    System.out.print("enter number2:");
    int number2=input.nextInt();
    int result=number1 & number2;
    System.out.println("RESULT OF BITWISE & OPERATOR:"+result);
  }
}

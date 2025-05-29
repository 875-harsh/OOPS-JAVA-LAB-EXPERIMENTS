import java.util.Scanner;

public class challenge16 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number:");
    int number=input.nextInt();
    if(number%2==0){
      System.out.print("EVEN NUMBER");
    }else{
      System.out.print("ODD NUMBER");
    }
  }
}

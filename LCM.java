import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number1:");
    int n1=input.nextInt();
    System.out.print("enter number2:");
    int n2=input.nextInt();
    int i=1;
    while(true){
      int factor=n1*i;
      if(factor%n2==0){
        System.out.print("LCM IS:"+factor);
      
      }
    }
  }
}

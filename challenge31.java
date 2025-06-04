import java.util.Scanner;

public class challenge31 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter number:");
    int n=input.nextInt();
    int sum=0;
    while(n > 0){
      sum=sum + (n%10);
      n/=10;
    }
    System.out.print("SUM IS:"+sum);

  }
}

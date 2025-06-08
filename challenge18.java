import java.util.Scanner;

public class challenge18 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter year:");
    int year=input.nextInt();
    if(year%4==0 && year%100!=0){
      System.out.print("LEAP YEAR");
    }else{
      if(year%400==0){
        System.out.print("LEAP YEAR");
      }else{
        System.out.print("NOT A LEAP YEAR");
      }
    }
  }
}

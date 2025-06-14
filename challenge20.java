import java.util.Scanner;

public class challenge20 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter age:");
    int age=input.nextInt();
    if(age<13){
      System.out.print("CHILD");
    }else if(age<20){
      System.out.print("TEEN");
    }else if(age<60){
      System.out.print("ADULT");
    }else{
      System.out.println("SENIOR");
    }
  }
}

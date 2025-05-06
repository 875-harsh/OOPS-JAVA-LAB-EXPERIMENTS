import java.util.Scanner;
interface Student{
  void input();
  void display();
}
class Client implements Student{
  String name;long reg;double m1,m2,m3,m4,avg;
  public void input(){
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER STUDENT NAME:");
    name=sc.nextLine();
    System.out.print("ENTER STUDENT REGISTRATION NUMBER:");
    reg=sc.nextLong();
    System.out.print("ENTER MARKS1:");
    m1=sc.nextDouble();
    System.out.print("ENTER MARKS2:");
    m2=sc.nextDouble();
    System.out.print("ENTER MARKS3:");
    m3=sc.nextDouble();
    System.out.print("ENTER MARKS4:");
    m4=sc.nextDouble();
    avg=(m1+m2+m3+m4)/4;
  }
  public void display(){
    System.out.println("NAME:"+name);
    System.out.println("REGISTRATION NUMBER:"+reg);
    System.out.println("MARKS1:"+m1);
    System.out.println("MARKS2:"+m2);
    System.out.println("MARKS3:"+m3);
    System.out.println("MARKS4:"+m4);
    System.out.println("AVERAGE MARKS:"+avg);
  }
}
class A{
  public static void main(String[] args) {
    Client c=new Client();
    c.input();
    c.display();
  }
}
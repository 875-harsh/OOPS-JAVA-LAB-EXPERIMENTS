public class OOPS{
  public static void main(String[] args) {
    Pen p1=new Pen(); //created a pen object called p1
    p1.setColor("RED");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color="BLUE"; //changing the color of p1 to blue
    System.out.println(p1.color);
  }
}
class Pen{
  String color;
  int tip;

  void setColor(String c){
    color = c;
  }
  void setTip(int t){
    tip = t;
  }
}
class Student{
  String name;
  int age;
  float percentage;

  void calculatePercentage(int m1,int m2,int m3){
    percentage = (m1+m2+m3)/3;
  }
}
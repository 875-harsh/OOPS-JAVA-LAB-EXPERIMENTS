//METHOD OVERLOADING:

class A{
  void add(){
    int a=10,b=20;
    int c=a+b;
    System.out.println(c);
  }
  void add(int x,int y){
    int c=x+y;
    System.out.println(c);
  }
  void add(int x,double y){
    double c=x+y;
    System.out.println(c);
  }
  public static void main(String[] args) {
    A obj=new A();
    obj.add();obj.add(40,50);obj.add(20,67.89);
  }
}
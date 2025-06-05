class Instance{
  public static void main(String[] args) {
    A r=new A();
  }
}

class A{
  int a,b;
  A(){
    a=40;b=30;
    System.out.println(a+" "+b);
  }
  {
    a=10;b=20;
    System.out.println(a+" "+b);
  }
}
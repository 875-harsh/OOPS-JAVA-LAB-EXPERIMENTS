class ThisKeyword{

  ThisKeyword(){
    this(20);
  }
  ThisKeyword(int a){
    System.out.println(a);
  }
  public static void main(String[] args) {
    ThisKeyword obj=new ThisKeyword(100);
  }
}
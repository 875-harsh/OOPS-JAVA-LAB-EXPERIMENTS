//ABSTARCT METHOD:

abstract class Programming{
  public abstract void develop();
  public abstract void rank();
}
abstract class HTML extends Programming{
  @Override
  public void develop(){
    System.out.println("TIM LEE");
  }

}
class JAVA extends HTML{
  @Override
  public void rank(){
    System.out.println("3rd RANK");
  }
}
class Amethod{
  public static void main(String[] args) {
    Programming h=new JAVA();
    h.develop();h.rank();
  }
}
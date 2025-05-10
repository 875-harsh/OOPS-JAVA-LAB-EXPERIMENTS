class ThrowDemo{
  public static void main(String[] args) {
    //System.out.println(10/0);  //this is done by its own internally

    throw new ArithmeticException("/ by zero");  //this is done by us explicitely 
  }
}
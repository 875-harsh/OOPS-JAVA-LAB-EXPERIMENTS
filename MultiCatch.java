class MultiCatch{
  public static void main(String[] args) {
    try{
      int a=10/2;
      System.out.println(a);
      int arr[]={1,2,3,4,5};
      System.out.println(arr[10]);
      String s="harsh";
      System.out.println(s.toUpperCase());
    }
    catch(ArrayIndexOutOfBoundsException x){
      System.out.println("ARRAY EXCEPTION");
    }
    catch(ArithmeticException y){
      System.out.println("ARITHMETIC EXCEPTION");
    }
    catch(NumberFormatException z){
      System.out.println("NUMBER FORMAT EXCEPTION");
    }
    catch(Exception e){
      System.out.println("ALL TYPE EXCEPTION");
    }
  }
}
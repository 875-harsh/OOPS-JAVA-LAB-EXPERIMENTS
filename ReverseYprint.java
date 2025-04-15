public class ReverseYprint {
  public static void main(String[] args) {
    for(int i=1;i<=7;i++){
      for(int j=1;j<=7;j++){
        if((j==4&&i<5)||(i+j==8&&i>3)||(i==j&&i>4)){
          System.out.print(" *");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}

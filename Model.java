class InvalidAgeException extends Exception{
  InvalidAgeException(String ms){
    System.out.println(ms);
  }
}
class Model{
  public static void main(String[] args) {
    try{
      c(99);
    }
    catch(InvalidAgeException e){
    }
  }

  public static void c(int age)throws InvalidAgeException{
    if(age<1 || age>100){
      throw new InvalidAgeException("InvalidAgeException");
    }
    else{
      System.out.println("You are eligible");
    }
  }
}
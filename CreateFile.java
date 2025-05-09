import java.io.*;
class CreateFile{
  public static void main(String[] args) {
    File f=new File("C:\\Users\\Harsh Janghel\\Desktop\\LC.txt");
    try{
      if(f.createNewFile()){
        System.out.println("File created successfully");
      }else{
        System.out.println("File already exists");
      }
    }
    catch(IOException e){
    }
  }

}
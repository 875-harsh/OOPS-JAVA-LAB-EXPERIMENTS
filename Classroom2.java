//HASHSET:

import java.util.HashSet;

public class Classroom2 {
  public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    
    set.add(2);
    set.add(4);
    set.add(6);
    set.add(8);
    set.add(2);
    System.out.println(set);

    if(set.contains(9)){
      System.out.println("present");
    }
    else{
      System.out.println("not present");
    }
    set.remove(4);
    System.out.println(set);
  }
}

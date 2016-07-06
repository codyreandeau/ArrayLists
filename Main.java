import java.util.*;
  
public class Main {
  
  public static void main(String[] args){
    
    ArrayList<String> list = new ArrayList<String>();
    
    list.add("Array");
    list.add("Lists");
    list.add("For");
    list.add("The");
    list.add("Win");
    list.add(0, "Wooooooooo!");
    
    for(int i=0; i < list.size(); i++) 
    {
      System.out.println(list.get(i));
    }
    
    
  }
}
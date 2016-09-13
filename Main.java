import java.util.*;
  
public class Main {
  
  public static void main(String[] args){
    
    List<String> list = new ArrayList<String>();
    
    ListIterator iterate = list.listIterator();
    
    list.add("Array");
    list.add("Lists");
    list.add("For");
    list.add("The");
    list.add("Win");
    list.add(0, "Wooooooooo!");
    list.remove(1);
    
    for(int i=0; i < list.size(); i++) 
    {
      System.out.print(list.get(i) + " ");
    }
    
    System.out.println();
    System.out.println("-----------------------------");
    
    list.set(0, "Array");
    list.set(2, "Are");
    list.set(4, "Best");
    
    for(String item: list) {
      System.out.print(item + " ");
    }
    
    System.out.println();
    System.out.println("-----------------------------");
    list.remove(2);
    list.remove(3);
    
    while(iterate.hasNext()) {
      iterate.next();
    }
    iterate.remove();
    
    System.out.println(list);
    
    }
}
import java.util.*;
  
public class Main {
  
  public static void main(String[] args){
    
    List<String> list = new ArrayList<String>();
    
    list.add("Array");
    list.add("Lists");
    list.add("For");
    list.add("The");
    list.add("Win");
    list.add(0, "Wooooooooo!");
    list.add("Cool");
    
    ListIterator iterate = list.listIterator();
    
    while(iterate.hasNext()) {
      iterate.next();
    }
    iterate.remove();
    
    for(int i=0; i < list.size(); i++) 
    {
      System.out.print(list.get(i) + " ");
    }
    
    System.out.println();
    System.out.println("-----------------------------");
    
    list.set(1, "Lists");
    list.set(2, "Are");
    list.set(5, "Best");
    list.remove(3);
    
    for(String item: list) {
      System.out.print(item + " ");
    }
    
    System.out.println();
    System.out.println("-----------------------------");
    list.remove(2);
    list.remove(3);
    list.remove(2);
    
    System.out.println(list);
    
    }
}
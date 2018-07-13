import java.util.*;
public class HashSet5 {
	public static void main(String args[]){  
		  LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("jhuna");  
		  al.add("pallavi");  
		  al.add("debi");  
		  al.add("jhuna");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
}
}
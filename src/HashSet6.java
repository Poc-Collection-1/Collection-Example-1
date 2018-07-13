import java.util.*;
public class HashSet6  
{
	public static void main(String args[])
	{
	HashSet<String> set=new HashSet<String>();
	set.add("rabi");
	set.add("ajay");
	set.add("vijay");
	set.add("jhuna");
	set.add("rabi");
	set.add("soono");
	set.add("vijay");
	set.add("pallu");
	Iterator<String> itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}

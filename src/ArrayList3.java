import java.util.*;
public class ArrayList3 
{
	public static void main(String args[])
	{
		ArrayList <String> list =new ArrayList<String>();
		list.add("jhuna");
		list.add("pallavi");
		list.add("debi");
		list.add("jhuna");
		list.add("pallavi");
		list.add("debi");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

import java.util.*;
class HashSet1 
{
	int id;
		String name,author,publisher;
		int quantity;
		public HashSet1(int id,String author,String name,String publisher,int quantity)
		{
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
			this.quantity = quantity;
			
		}
	

 static class HashSetExample
{
	 public static void main(String args[])
	 {
		HashSet<HashSet1> set=new HashSet<HashSet1>();
		  HashSet1 b1=new HashSet1(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		    HashSet1 b2=new HashSet1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    HashSet1 b3=new HashSet1(103,"Operating System","Galvin","Wiley",6);    
		    set.add(b1);  
		    set.add(b2);  
		    set.add(b3);    
		    for(HashSet1 b:set){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}
	 }
}
}
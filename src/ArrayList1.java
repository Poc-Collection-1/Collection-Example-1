import java.util.*;  
class ArrayList1 {
int id;  
String name,author,publisher;  
int quantity;  
public ArrayList1(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}   
static class ArrayListExample {
public static void main(String args[])
{
    //Creating list of Books  
    List<ArrayList1> list=new ArrayList<ArrayList1>();  
    //Creating Books  
    ArrayList1 b1=new ArrayList1(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    ArrayList1 b2=new ArrayList1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    ArrayList1 b3=new ArrayList1(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(ArrayList1 b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}
}
}

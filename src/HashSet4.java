import java.util.*;
public class HashSet4 {
	private String s;
    public HashSet4(String s){
        this.s  = s ;
    }
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<Object>();
        HashSet4 t1 = new HashSet4("Keval");
        HashSet4 t2 = new HashSet4("Keval");

        String s1 = new String("Keval");        

        hs.add(t1);
        hs.add(t2);
        hs.add(s1);     
        System.out.println("Set Size :: " + hs.size());

        s1 = new String("Demo");        
        hs.remove(s1);
        System.out.println("Set Size :: " + hs.size());


    }
}

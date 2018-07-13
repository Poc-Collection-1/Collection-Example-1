import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

  public static void main(String[] a) {
    String elements[] = { "A", "B", "C", "D", "E" };
    Set set = new HashSet(Arrays.asList(elements));

    set.add("Z");

    System.out.println(set);
  }
}
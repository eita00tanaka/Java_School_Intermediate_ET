import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

class Practice15_02 {
  public static void main(String[] args) {
    printSet();
  }

  // ----------------------------
  public static void printSet() {
    ArrayList<String> list = new ArrayList<>();

    list.add("kubo");
    list.add("mitoma");
    list.add("kamada");
    list.add("kamada");

    Set<String> set = new TreeSet<>(list);

    for (String s : set) {
      System.out.println(s);
    }
  }
}

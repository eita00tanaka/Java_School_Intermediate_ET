import java.util.ArrayList;

public class Practice15_01 {
  public static void main(String[] args) {
    printList();
    
  }

  // ----------------------------
  public static void printList() {
    ArrayList<String> list = new ArrayList<>();

    list.add("kubo");
    list.add("mitoma");
    list.add("kamada");
    list.add("kamada");

    for (String l : list) {
      System.out.println(l);
    }
  }
}

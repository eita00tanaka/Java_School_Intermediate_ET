import java.util.HashMap;
import java.util.Map;

class ComprehensiveIntermediate02_01 {
  public static void main(String[] args) {
    grades();
  }

  // --------------------------
  public static void grades() {
    Map<String, Integer> map = new HashMap<>();

    map.put("国語", 90);
    map.put("数学", 80);
    map.put("英語", 70);

    for(Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

  }
  
}
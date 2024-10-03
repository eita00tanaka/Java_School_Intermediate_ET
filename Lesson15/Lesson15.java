// import java.util.HashSet;
// import java.util.TreeSet;
// import java.util.Set;

// class Lesson15 {
//   public static void main(String[] args) {
//     // HashSetデータを作成
//     Set<Integer> hs = new HashSet<Integer>();
//     // 値を追加
//     hs.add(1);
//     hs.add(2);
//     hs.add(3);
//     hs.add(2);
//     hs.add(null);
//     hs.add(4);
//     hs.remove(3); // 指定した値を削除
    
//     System.out.println(hs);
//   }
// }

// class Lesson15 {
//   public static void main(String[] args) {
//     // TreeSetデータを作成 右辺のデータ型は省略可
//     Set<Integer> ts = new TreeSet<>();
//     //値を追加
//     ts.add(1);
//     ts.add(5);
//     ts.add(2);
//     ts.add(3);
//     ts.add(2);
//     // ts.add(null); エラーになります
//     ts.add(4);
//     ts.remove(3); // 指定した値を削除
    
//     System.out.println(ts);
//   }
// }


import java.util.HashMap;
import java.util.Map;

class Lesson15 {
    public static void main(String[] args) {
      Map<String,Integer> map = new HashMap<>();

      map.put("リンゴ",80);
      map.put("オレンジ",120);
      System.out.println(map.get("リンゴ")); // 80

      map.put("リンゴ",140);
      System.out.println(map.get("リンゴ")); // 140　＊上書き

      map.put("キウイ",180);
      System.out.println(map.get("キウイ")); // 180


      System.out.println("-------");


      map.put("ブドウ",80);
      map.put("モモ",120);
      System.out.println(map.get("ブドウ")); // 80

      map.putIfAbsent("ブドウ",140);
      System.out.println(map.get("ブドウ")); // 80　＊上書きされない

      map.putIfAbsent("ミカン",180);
      System.out.println(map.get("ミカン")); // 180


      System.out.println("-------");


      System.out.println(map.size()); // 6
      
      map.remove("モモ");
      System.out.println(map.size()); // 5

      map.clear();
      System.out.println(map.size()); // 0
    }
}



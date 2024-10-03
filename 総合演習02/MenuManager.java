import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuManager {
  Map<String, ArrayList<String>> map = new HashMap<>();
  ArrayList<String> list = new ArrayList<>();

  // コンストラクタ
  MenuManager() {
    //サンドイッチメニューの追加
    list = new ArrayList<>();
      list.add("ハンバーガー");
      list.add("チーズバーガー");
      list.add("ダブルチーズバーガー");
      map.put("sandwitch", list);

    // ドリンクメニューの追加
    list = new ArrayList<>();
      list.add("コーラ");
      list.add("オレンジジュース");
      list.add("コーヒー");
      map.put("drink", list);

    // サイドメニューの追加
    list = new ArrayList<>();
      list.add("フライドポテト");
      list.add("チキンナゲット");
      list.add("アップルパイ");
      map.put("sidemenu", list);

  }

  // --------------------------
  public void showMenu(String category) {
    System.out.println(map.get(category));
  }

  // --------------------------
  public void setMenu(String category, String menu) {
    ArrayList<String> categoryList = map.get(category);
    categoryList.add(menu);

    System.out.println(map.get(category));
  }

  // --------------------------
  public void searchMenu(String menu) {
    ArrayList<String> sandwitchList = map.get("sandwitch");
    ArrayList<String> drinkList = map.get("drink");
    ArrayList<String> sidemenuList = map.get("sidemenu");


    if (sandwitchList.contains(menu)) {
      System.out.println(menu + "は sandwitch に含まれています。");

    } else if (drinkList.contains(menu)) {
      System.out.println(menu + "は drink に含まれています。");

    } else if (sidemenuList.contains(menu)) {
      System.out.println(menu + "は sidemenu に含まれています。");

    } else {
      System.out.println("該当するメニューはありません。");
    }
  }
  

}

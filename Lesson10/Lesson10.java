
import java.util.Random;

// switch文
// ----------------------
class Lesson10_02 {
  public static void main(String[] args) {
    System.out.println("あなたの運勢を占います");

    // 1〜4の乱数をfortune に代入
    int fortune = new Random().nextInt(4) + 1;

    switch (fortune) {
      case 1:
        System.out.println("大吉");
        break;

      case 2:
        System.out.println("中吉");
        break;

      case 3:
        System.out.println("吉");
        break;

      default:
        System.out.println("凶");
    }
  }
}

// switch式
// ----------------------
class Lesson10_04 {
  public static void main(String[] args) {
    System.out.println("今日のゴミ回収の種類は");
    // 1~7の乱数を  に代入
    int day = new Random().nextInt(7) + 1;

    switch (day) {
      case 1, 3, 5 -> System.out.println("燃えるゴミの日です");
      case 2 -> System.out.println("燃えないゴミの日です");
      case 4 -> System.out.println("プラスチックゴミの日です");
      case 6 -> System.out.println("ビン・カンゴミの日です");
      default -> System.out.println("ごみの回収はありません");
    }

  }
}

// switch式_yield
// ----------------------
class Lesson10_06 {
  public static void main(String[] args) {
    System.out.println("今日のゴミ回収の種類は");
    // 1~7の乱数を に代入
    int day = new Random().nextInt(7) + 1;

    int result_yield = switch (day) {
      case 1, 3, 5 -> {
        System.out.println("燃えるゴミの日です");
        yield day;
      }
      case 2 -> {
        System.out.println("燃えないゴミの日です");
        yield day;
      }
      case 4 -> {
        System.out.println("プラスチックゴミの日です");
        yield day;
      }
      case 6 -> {
        System.out.println("ビン・カンゴミの日です");
        yield day;
      }
      default -> {
        System.out.println("ごみの回収はありません");
        yield day;
      }
    };
    System.out.println("day の値は " + result_yield + " でした");
  }
}


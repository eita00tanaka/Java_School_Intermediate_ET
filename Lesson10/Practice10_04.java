import java.util.Random;

class Practice10_04 {
  public static void main(String[] args) {
    int color = new Random().nextInt(5) +1;

    switch (color) {
      case 1 -> System.out.println("今日のラッキーカラーはピンクです");
      case 2, 3, 4 -> System.out.println("今日のラッキーカラーはレッドです");
      case 5 -> System.out.println("今日のラッキーカラーはゴールドです");
      default -> System.out.println("該当なし");
    }
  }
}

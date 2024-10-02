import java.util.Random;

public class Practice14_02 {
  public static void main(String[] args) {

    try {
      printRandom();

    } catch (ArithmeticException e) {
        System.out.println("計算例外をキャッチしました。");

    } catch (NullPointerException e) {
        System.out.println("ぬるぽをキャッチしました。");

    } finally {
        System.out.println("finally 計算終了");
    }

    System.out.println("処理終了");
  }

  // -------------------------------------
  public static void printRandom() {
    int num = new Random().nextInt(2);

    if (num == 0) {
      int i = 1 / num;
      System.out.println(i);

    } else if (num == 1) {
        printLength(null);
        
    } else {
        System.out.println("該当なし");
    }
  }

  // -------------------------------------
  public static void printLength(String str) {
    int i = str.length();
    System.out.println(str + "は" + i + "文字です");
  }
}

import java.util.Scanner;
import java.util.Random;

class ComprehensiveIntermediate02_03 {
  public static void main(String[] args) {
    slot();
  }

  // --------------------------
  public static void slot() {
    System.out.println("ゾロ目で大当たり！チャンスは30回");

    Scanner scanner = new Scanner(System.in);
      System.out.print("begin と入力してください: ");
      String str = scanner.next();
    
      if(str.equals("begin")) {
        Random random = new Random();
        boolean judgement = false; // 当たり状況を判定する為の変数

        // 30回スロットを回して当たりが出ればループを抜ける
        for (int i = 1; i < 31; i++) {
          int numA = random.nextInt(9) + 1;
          int numB = random.nextInt(9) + 1;
          int numC = random.nextInt(9) + 1;

          System.out.println(i + "回目: " + numA + " " + numB + " " + numC);

          if (numA == numB && numB == numC) {
            System.out.println(i + "回目で大当たりです。おめでとうございます！");
            judgement = true;
            break;
          }
        }

        // 30回のループで当たりが出なかった場合
        if (!judgement) {
          System.out.println("残念でした。終わります。");
        }

      } else {
        System.out.println("入力内容に誤りがあります。");
      }

    scanner.close();
    
  }
}

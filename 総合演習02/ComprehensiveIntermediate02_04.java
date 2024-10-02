import java.util.Random;
import java.util.Scanner;

class ComprehensiveIntermediate02_04 {
  public static void main(String[] args) {
    try {
      hands();
    } catch (Exception e) {
      System.out.println("指定された値を入力してください");
      System.out.println("システムを終了します");
    }

  }

  // --------------------------
  public static void hands() {
    Scanner scan = new Scanner(System.in);
    Random randdom = new Random();
    String[] hands = {"グー", "チョキ", "パー"};

    while (true) {
      System.out.println("ジャンケン");

      // ユーザーの手
      int playerHands = playerHands(scan);

      // コンピュータの手
      int cpHands = randdom.nextInt(3);

      // ジャンケンの処理
      System.out.println("あなた: " + hands[playerHands]);
      System.out.println("コンピュータ: " + hands[cpHands]);

      if (playerHands == cpHands) {
        System.out.println("引き分け");

      } else if ((playerHands == 0 && cpHands == 1) || (playerHands == 1 && cpHands == 2) || (playerHands == 2 && cpHands == 0)) {
        System.out.println("勝ち");

      } else {
        System.out.println("負け");
      }

      // リプレイの処理
      System.out.print("もう一度プレイ (Yes -> 1, NO -> 0) : ");
      int replay = scan.nextInt();

      if (replay != 1) {
        break;
      }

    } //end while

    scan.close();
    System.out.println("終了");

  }

  // --------------------------
  public static int playerHands(Scanner scan) {
    int player;

    // 正しい入力がされるまでループ
    while (true) {
      System.out.print("0:グー 1:チョキ 2:パー ＞数字を入力してください: ");

      if (scan.hasNextInt()) {
        player = scan.nextInt();

        if (player >= 0 && player <= 2) {
          break;
        }

      } else {
        scan.nextInt();
      }

      System.out.println("入力された値が無効です");

    } //end while

    return player;
    
  }
  
}

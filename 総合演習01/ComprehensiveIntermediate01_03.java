import java.util.Scanner;

class ComprehensiveIntermediate01_03 {
  public static void main(String[] args) {
    System.out.println("二次方程式(ax^2 + bx + c = 0)の解を判別するプログラム");

    calc();

  }

  // --------------------------
  public static void calc() {
    try {
      // 係数を入力
      System.out.println("係数 a,b,c を入力");

      Scanner scanner = new Scanner(System.in);
        System.out.print(" " + "a= ");
          double numA = scanner.nextDouble();
        System.out.print(" " + "b= ");
          double numB = scanner.nextDouble();
        System.out.print(" " + "c= ");
          double numC = scanner.nextDouble();

      scanner.close();

      // 判別式を用いて解を判別
      double d = numB * numB - 4 * numA * numC;

      if (d > 0) {
        System.out.println("2つの実数解です");
      } else if (d == 0) {
        System.out.println("重解です");
      } else if (d < 0) {
        System.out.println("2つの虚数解です");
      } else {
        System.out.println("N/A");
      }
      
    } 
    // 数字以外が入力された場合
    catch (Exception e) {
      System.out.println("※数字を入力してください");
      calc();
    }

  }
  
}


// ----------------------------------------------
// メモ
// ax^2 + bx + c = 0
// 判別式: D = b^2 - 4ac
// 解の公式: x = -b + √(b^2 - 4ac) / 2a

// 異なる2つの実数解: D > 0
// 重解: D = 0
// 異なる2つの虚数解: D < 0

// 平方根計算 Math.sqrt(***)

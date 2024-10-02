import java.util.Scanner;

class ComprehensiveIntermediate01_04 {
  public static void main(String[] args) {
      admissionFee();

  }

  // --------------------------
  public static void admissionFee() {
    try {
      Scanner scanner = new Scanner(System.in);

      // 人数の取得
      System.out.print("人数を入力: ");
      int peopleNum = scanner.nextInt();

      // 入場料を定義
      int fee = 600;

      if ((peopleNum >= 5) && (peopleNum <= 19)) {
        fee = 550;
      } else if (peopleNum >= 20) {
        fee = 500;
      }

      //入場料を計算
      int total = fee * peopleNum;
      System.out.println("入場料: " + total + "円");

      scanner.close();
      
    } 
    // 人数が整数で入力されなかった場合の処理
    catch (Exception e) {
      System.out.println("※整数を入力してください");
      admissionFee();
    }
    
  }
  
}

import java.util.Scanner;

class ComprehensiveIntermediate01_02 {
  public static void main(String[] args) {
    inputNum();
  }

  // --------------------------
  public static void inputNum() {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("整数を小さい順に3つ入力: ");
      int numA = scanner.nextInt();
      int numB = scanner.nextInt();
      int numC = scanner.nextInt();

      if ((numA <= numB) && (numB <= numC)) {
        System.out.println("OK");
      } else {
        System.out.println("NG");
      }

      scanner.close();
      
    } 
    // 数字が整数で入力されなかった場合の処理
    catch (Exception e) {
      System.out.println("※整数を入力してください");
      inputNum();
    }
    
  }
  
}

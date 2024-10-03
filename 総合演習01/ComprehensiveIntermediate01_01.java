import java.util.Scanner;

class ComprehensiveIntermediate01_01 {
  public static void main(String[] args) {
    inputNum();
    
  }

  // --------------------------
  public static void inputNum() {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.print("整数を入力: ");
      int num = scanner.nextInt();

      if (num % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
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

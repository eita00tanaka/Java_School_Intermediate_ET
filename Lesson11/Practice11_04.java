import java.util.Scanner;

class Practice11_04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      System.out.print("何段>");
      int inputNum = scanner.nextInt();
      
      if ((0 < inputNum) && (inputNum < 6)) {
        for (int i = 0; i < inputNum; i++){
          for (int j = inputNum - i - 1; j >= 0; j--) {
            System.out.print(" ");
          }
          for (int j = 0; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
        break;
      }
    }

    scanner.close();
  }
}

import java.util.Random;

class Practice10_01 {
  public static void main(String[] args) {
    int gender = new Random().nextInt(2);

    switch (gender) {
      case 0 -> System.out.println("あなたは男です");
      case 1 -> System.out.println("あなたは女です");
      default -> System.out.println("該当なし");
    }
  }
}

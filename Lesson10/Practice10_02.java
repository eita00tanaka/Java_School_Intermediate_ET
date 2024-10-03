import java.util.Random;

class Practice10_02 {
  public static void main(String[] args) {
    int age = new Random().nextInt(21);

    switch (age) {
      case 0, 1, 2, 3 -> System.out.println("あなたはbabyです");
      case 18, 19, 20 -> System.out.println("あなたはadultです");
      default -> System.out.println("あなたはkidです"); //4~17の処理
    }
  }
}

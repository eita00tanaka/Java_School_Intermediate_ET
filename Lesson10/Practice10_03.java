import java.util.Random;

class Practice10_03 {
  public static void main(String[] args) {
    int age = new Random().nextInt(21);
    int gender = new Random().nextInt(2);

    String age_result = switch (age) {
      case 0, 1, 2, 3 -> "baby";
      case 4, 5 -> "child";
      case 18, 19, 20 -> "adult";
      default -> "kid"; //6~17の処理
    };

    String gender_result = switch (gender) {
      case 0 -> "男";
      case 1 -> "女";
      default -> "該当なし";
    };

    System.out.println("あなたは" + age_result + "な" + gender_result + "です");
  }
}

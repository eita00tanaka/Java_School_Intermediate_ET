import java.util.Random;

class Practice11_03 {
  public static void main(String[] args) {
    int i = 0;

    while (i < 10) {
      int num = new Random().nextInt(6) +1;

      if (num %2 == 1) {
        System.out.println( i + 1 + "回目、" + num + "が出ました");
        i++;
      } else {
        i++;
      }
    }
  }
}
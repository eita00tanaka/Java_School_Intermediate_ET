class Practice11_01 {
  public static void main(String[] args) {
    int total = 0;
    int i = 1;

    while (i < 11) {
      total += i;
      i++;
    }

    System.out.println("1〜10の合計は" + total + "です");
  }
}

class Practice12_01 {
  public static void main(String[] args) {
    int x = 2;
    int y = 1;

    int minus = minusDown(x, y);

    System.out.println("minus = " +  minus);
  }

  private static int minusDown(int x, int y) {
    return x - y;
  }
}

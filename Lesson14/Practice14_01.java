class Practice14_01 {
  public static void main(String[] args) {
    try {
      printLength(null);

    } catch (NullPointerException e) {
      System.out.println("ぬるぽをキャッチしました。");
    } finally {
      System.out.println("finally ブロックです。");
    }

    System.out.println("処理終了");
  }

  public static void printLength(String str) {
    int i = str.length();
    System.out.println(str + "は" + i + "文字です");
  }
}

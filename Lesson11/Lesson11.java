// class Lesson11 {
//   public static void main(String[] args) {
//       int i = 0;
//       while (i < 3) {
//           System.out.println((i + 1) + "回目の処理です");
//           i++;
//       }
//       System.out.println("処理が終了しました");
//   }
// }

// class Lesson11 {
//   public static void main(String[] args) {
//       int i = 0;
//       while (i > -1) {
//           if (i > 4) {
//               break;
//           }
//           System.out.println((i + 1) + "回目の処理です");
//           i++;
//       }
//       System.out.println("処理が終了しました");
//   }
// }

// class Lesson11 {
//   public static void main(String[] args) {
//       int i = 0;
//       while (i > -1) {
//           if (i > 4) {
//               break;
//           } else if (i % 2 == 0) {
//               i++;
//               continue;
//           }

//           System.out.println((i + 1) + "回目の処理です");
//           i++;
//       }
//       System.out.println("処理が終了しました");
//   }
// }

// ------------------------------------------------------

// public class Lesson11 {
//   public static void main(String[] args) {
//       int i = 0;
//       while (i > 0) {
//           System.out.println((i + 1) + "回目の処理です");
//           i++;
//       }
//       System.out.println("処理が終了しました");
//   }
// }

public class Lesson11 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println((i + 1) + "回目の処理です");
            i++;
        } while (i > 100);
        System.out.println("処理が終了しました");
    }
}
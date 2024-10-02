class Practice12_02 {
  public static void main(String[] args) {
    String morning = greet("朝");
    System.out.println(morning);

    String noon = greet("昼");
    System.out.println(noon);

    String night = greet("夜");
    System.out.println(night);

  }

  private static String greet(String time) {
    if(time == "朝") {
      return "Good morning!!";
    } else if (time == "昼") {
      return "Good afternoon!!";
    } else if (time == "夜") {
      return "Good evening!!";
    }
    return time;
  }
}

// class Practice12_02 {
//   public static void main(String[] args) {
//     greet("朝", "昼", "夜");

//   }

//   private static void greet(String morning, String noon, String night) {
//     if ((morning == "朝") && (noon == "昼") && (night =="夜")) {
//       System.out.println("Good morning!!");
//       System.out.println("Good afternoon!!");
//       System.out.println("Good evening!!");
//     }
//   }
// }

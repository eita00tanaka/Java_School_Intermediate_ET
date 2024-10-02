class Practice13_01 {
  public static void main(String[] args) {
    Animal animal01 = new Animal();
    animal01.name = "pochi";
    System.out.println(animal01.name);

    animal01.type = "dog";
    animal01.cryAnimals();

    // -----------------------------------
    Animal animal02 = new Animal();
    animal02.name = "tama";
    System.out.println(animal02.name);

    animal02.type = "cat";
    animal02.cryAnimals();
  }
}

class Animal {
  String name = "Jhon";
  String type = "nothing";

  /**
   * 動物に合わせて鳴き声を出力するメソッド
   *
   */
  public void cryAnimals() {
    System.out.println(
      switch (type) {
        case "cat" -> "nya-";
        case "dog" -> "wan";
        default -> "特定できませんでした";
      }
    );
  }
}

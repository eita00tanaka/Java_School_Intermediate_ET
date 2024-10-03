class ComprehensiveIntermediate01_05 {
  public static void main(String[] args) {
    calc();
    
  }

  // --------------------------
  public static void calc() {
    for(int numA = 1; numA < 10; numA++) {

      for (int numB = 1; numB < 10; numB++) {
          int total = numA * numB;
          System.out.printf("%3d", total);
      }

      System.out.println();

    }
    
  }
  
}

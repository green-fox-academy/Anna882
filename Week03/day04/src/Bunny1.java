public class Bunny1 {
  public static void main(String[] args) {
    int numberOfBunnies = 76;
    int numberOfBunnyEars = numberOfEars(numberOfBunnies);
    System.out.println(numberOfBunnyEars);
    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).
  }
  public static int numberOfEars(int numberOfBunnies){
    if (numberOfBunnies == 0){
      return 0;
    }
    numberOfBunnies = 2 + numberOfEars(numberOfBunnies-1);
    return numberOfBunnies;
  }
}

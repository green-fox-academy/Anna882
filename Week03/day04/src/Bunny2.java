public class Bunny2 {
  public static void main(String[] args) {
    int numberOfBunnies = 7;
    System.out.println(numberOfEars(numberOfBunnies));
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
  }
  public static int numberOfEars(int numberOfBunnies){
    if (numberOfBunnies == 1){
      return 2;
    } else if(numberOfBunnies % 2 == 1){
      numberOfBunnies = 2 + numberOfEars(numberOfBunnies-1);
    } else {
      numberOfBunnies = 3 + numberOfEars(numberOfBunnies-1);
    }
    return numberOfBunnies;
  }
}

public class Power {
  public static void main(String[] args) {
    int base = 2;
    int n = 4;
    System.out.println(computeBaseToNPower(base, n));
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  }
  public static int computeBaseToNPower(int base, int n){
    if (base == 1 || n == 1){
      return base;
    } else {
      return base * computeBaseToNPower(base, n - 1);
    }
  }
}

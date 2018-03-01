public class Power {
  public static void main(String[] args) {
    int base = 5;
    int n = 2;
    System.out.println(computeBaseToNPower(base, n));
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  }
  public static int computeBaseToNPower(int base, int n){
    if (base == 1 || n == 1){
      return base;
    } else {
      base = base * computeBaseToNPower(base, n - 1);
      return base;
    }
  }
}

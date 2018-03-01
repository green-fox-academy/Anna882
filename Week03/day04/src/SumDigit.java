public class SumDigit {
  public static void main(String[] args) {
    int n = 78;
    System.out.println(sumOfNDigitsRecursively(n));
  }
  public static int sumOfNDigitsRecursively(int n){
    if (n / 10 == 0){
      return n;
    } else {
      n = n % 10 + sumOfNDigitsRecursively(n / 10);
      return n;
    }

  }

}
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

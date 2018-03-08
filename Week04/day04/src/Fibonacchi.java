public class Fibonacchi {

  public static int fibonacchiCaltulator(int n) {
    int fibo = 0;
    if (n < 0) {
      System.out.println("negative number");
      fibo = -1;
    } else {
      int num1 = 0;
      int num2 = 1;
      for (int i = 0; i < n - 1; i++) {
        fibo = num1 + num2;
        num1 = num2;
        num2 = fibo;
      }
    }
    return fibo;
  }
}

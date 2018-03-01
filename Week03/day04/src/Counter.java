public class Counter {
  public static void main(String[] args) {
    int n = 12;
    counter(n);
  }
  public static void counter(int n) {
    System.out.println(n);
    if (n == 0){
      return;
    } else {
      counter(n-1);
    }
  }
}

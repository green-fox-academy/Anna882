public class Fibonacchi {
  public static void main(String[] args) {
    int nthNumber = 7;
    System.out.println(fibonacchiFac(nthNumber));
  }
  public static int fibonacchiFac(int nthNumber){
    if (nthNumber <= 2){
      return 1;
    } else {
      return fibonacchiFac(nthNumber - 1) + fibonacchiFac(nthNumber - 2);
    }
  }
}
public class Refactorio {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(refactorio(n));
  }
  public static int refactorio(int n){
    if (n == 1) {
      return 1;
    }
    else {
      n = n * refactorio(n - 1);
    }
    return n;
  }
}

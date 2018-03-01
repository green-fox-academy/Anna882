public class String3 {
  public static void main(String[] args) {
    String string = "1x2xx3xx4xxx";
    int stringLenght = string.length();
    String newString = String.valueOf(string.charAt(string.length()-1));
      System.out.println(changeToY(string, stringLenght-1, newString));
  }

  public static String changeToY(String string, int actualCharPosition, String newString){
    if (actualCharPosition < 0) {
      return newString;
    } else {
      newString = string.charAt(actualCharPosition) + "*" + newString;
    }
    return changeToY(string, actualCharPosition-1, newString);
    }
}

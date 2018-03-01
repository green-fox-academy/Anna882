public class String2 {
  public static void main(String[] args) {
    String string = "1x2xx3xalmafax4xxx";
    int stringLenght = string.length();
    String newString = "";
    System.out.println(changeToY(string, stringLenght-1, newString));
  }

  public static String changeToY(String string, int actualCharPosition, String newString){
    if (actualCharPosition < 0) {
      return newString;
    } else if (string.charAt(actualCharPosition) != 'x'){
      newString = string.charAt(actualCharPosition) + newString;
    }
    return changeToY(string, actualCharPosition-1, newString);
  }
}

package postit;

public class PostIt {
  String backgroundColor;
  String textOnIt;
  String textColor;

  public PostIt(String backgroundColor, String textOnIt, String textColor){
    this.backgroundColor = backgroundColor;
    this.textOnIt = textOnIt;
    this.textColor = textColor;
  }

  @Override
  public String toString() {
    return "postit{" +
            "backgroundColor='" + backgroundColor + '\'' +
            ", textOnIt='" + textOnIt + '\'' +
            ", textColor='" + textColor + '\'' +
            '}';
  }
}

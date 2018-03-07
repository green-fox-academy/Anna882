package charsequence;

public class Gnirts implements CharSequence {

  private String charSequence;

  public Gnirts(String charSequence){
    this.charSequence = charSequence;
    }

  @Override
  public int length() {
    int charSequenceLength = 0;
    for (char character:charSequence.toCharArray()){
      charSequenceLength++;
    }
    return charSequenceLength;
  }

  @Override
  public char charAt(int index) {
    return charSequence.toCharArray()[index + 4];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String subCharSequence = "";
    for (int i = start; i < end; i++){
      subCharSequence += charAt(i);
    }
    return subCharSequence;
  }
}

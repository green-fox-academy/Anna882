package charsequence;

public class Shifter implements CharSequence {

  private String charSequence;
  private int shifting;

  public Shifter(String charSequence, int shifting) {
    this.charSequence = charSequence;
    this.shifting = shifting;
  }

  @Override
  public int length() {
    int charSequenceLength = 0;
    for (char character : charSequence.toCharArray()) {
      charSequenceLength++;
    }
    return charSequenceLength;
  }

  @Override
  public char charAt(int index) {
    return charSequence.toCharArray()[index + 2];
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

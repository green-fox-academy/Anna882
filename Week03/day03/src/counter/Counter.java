package counter;

public class Counter {
  private int field;
  private int initialValue;
  public Counter(){

  }
  public Counter(int initialValue){
    this.initialValue = initialValue;
    this.field = initialValue;
  }
  public void add() {
    field++;
  }
  public void add(int numberToAdd) {
    field += numberToAdd;
  }

  public int get() {
    return field;
  }
  public void reset() {
    field = initialValue;
  }
}
package gardenapplication;

public class Flower {

  private String flowerColor;
  private int currentWaterAmount;
  private boolean needsWater;
  private double waterAbsorb = 0.75;

  public double getWaterAbsorb() {
    return waterAbsorb;
  }

  public Flower(String flowerColor) {
    this.flowerColor = flowerColor;
  currentWaterAmount = 0;
  }
  public String getFlowerColor() {
    return flowerColor;
  }

  public void setFlowerColor(String flowerColor) {
    this.flowerColor = flowerColor;
  }

  public int getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }

  public boolean isNeedsWater() {
    return needsWater;
  }

  public boolean needsWater() {
    if (currentWaterAmount < 5){

      System.out.println("The " + flowerColor + " Flower needs water.");
      return needsWater = true;
    } else {
      System.out.println("The " + flowerColor + " Flower doesn't need water.");
      return needsWater = false;

    }
  }
}

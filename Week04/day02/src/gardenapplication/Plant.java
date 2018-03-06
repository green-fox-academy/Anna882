package gardenapplication;

public class Plant {

  private String color;
  private int currentWaterAmount;
  private boolean needsWater;
  private double waterAbsorb;

  public double getWaterAbsorb() {
    return waterAbsorb;
  }

  public void setWaterAbsorb(double waterAbsorb) {
    this.waterAbsorb = waterAbsorb;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
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

  public void setNeedsWater() {
    needsWater = true;
  }

  public void resetNeedsWater() {
    needsWater = false;
  }
}

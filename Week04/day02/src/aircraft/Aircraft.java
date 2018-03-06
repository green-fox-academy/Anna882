package aircraft;

public class Aircraft {
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;
  private String type;

  public int getAmmo() {
    return currentAmmo;
  }

  public void setAmmo(int ammo) {
    this.currentAmmo = ammo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public Aircraft() {
    this.currentAmmo = 0;
  }

  public int fight() {
    int damage = baseDamage * currentAmmo;
    currentAmmo = 0;
    return damage;
  }

  public int reFill(int numberOfAmmo) {
    int temp = maxAmmo - currentAmmo;
    if (temp <= numberOfAmmo) {
      numberOfAmmo -= temp;
      currentAmmo += temp;
    } else {
      currentAmmo += numberOfAmmo;
      numberOfAmmo = 0;
    }
    return numberOfAmmo;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    String status = "Type " + type + " , Ammo: " + currentAmmo+ " , Base Damage: " + baseDamage + " , All Damage: " +
            (baseDamage * currentAmmo);
    return status;
  }
}

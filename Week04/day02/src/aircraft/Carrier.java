package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> aircrafts = new ArrayList<Aircraft>();
  private int storedAmmo;
  private int healthPoint;
  private int totalDamage;

  public Carrier(int initialAmmo, int healthPoint) {
    storedAmmo = initialAmmo;
    this.healthPoint = healthPoint;
  }

  public void addAircraft(String type) {
    if (type.equals("F16")) {
      Aircraft newAircraft = new F16();
      aircrafts.add(newAircraft);
    } else if (type.equals("F35")) {
      Aircraft newAircraft = new F35();
      aircrafts.add(newAircraft);
    }
  }

  public void fill() {
    if (storedAmmo <= 0){
      System.out.println("There is no ammo!");
    }
    else {
      for (Aircraft aircraft : aircrafts) {
        if (aircraft.getType().equals("F35")) {
          storedAmmo = aircraft.reFill(storedAmmo);
        }
      }
      for (Aircraft aircraft : aircrafts) {
        if (aircraft.getType().equals("F16")) {
          storedAmmo = aircraft.reFill(storedAmmo);
        }
      }
    }
  }

  public int getTotalDamage() {
    for (Aircraft aircraft:aircrafts) {
      totalDamage += aircraft.getBaseDamage() * aircraft.getAmmo();
    }
    return totalDamage;
  }

  public void fight(Carrier otherCarrier) {
    int allDamage = 0;
    for (Aircraft aircraft:aircrafts) {
      allDamage += aircraft.fight();
    }
    healthPoint -= allDamage;
  }

  public String getStatus() {
    String statusString;
    if (healthPoint == 0) {
      statusString = "It's dead Jim :(";
    } else {
      statusString = "HP: " + healthPoint + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " +
              storedAmmo + ", Total damage: " + totalDamage + "\n" + "Aircrafts:\n";
      for (Aircraft aircraft : aircrafts) {
        statusString += "Type: " + aircraft.getType() + ", Ammo: " + aircraft.getAmmo() + ", Base Damage: " +
                aircraft.getBaseDamage() + ", All Damage: " + (aircraft.getAmmo() * aircraft.getBaseDamage()) + "\n";
      }
    }
    return statusString;
  }
}

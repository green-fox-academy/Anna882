package aircraft;

public class Main {

  public static void main(String[] args) {

    Carrier carrier1 = new Carrier(4000, 3000);
    Carrier carrier2 = new Carrier(3000, 2500);
    carrier1.addAircraft("F35");
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F16");
    carrier1.addAircraft("F35");
    carrier1.fill();
    carrier1.getTotalDamage();

    carrier2.addAircraft("F15");
    carrier2.addAircraft("F35");
    carrier2.fill();
    carrier2.getTotalDamage();

    System.out.println(carrier1.getStatus());
    System.out.println(carrier2.getStatus());
    carrier1.fight(carrier2);
    System.out.println(carrier2.getStatus());

  }
}

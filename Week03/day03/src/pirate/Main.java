package pirate;

public class Main {
  public static void main(String[] args) {
    Pirate jack = new Pirate("Jack", 28);
    Pirate sparrow = new Pirate("Sparrow", 26);

    jack.brawl(sparrow);
    jack.drinkSomeRum();
    jack.howItGoingMate();
    sparrow.drinkSomeRum();
    sparrow.howItGoingMate();

  }
}

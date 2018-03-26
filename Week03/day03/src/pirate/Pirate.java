package pirate;

public class Pirate {

  private String name;
  private int age;
  private boolean live = true;
  private int intoxicateAmount;
  public Pirate(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void drinkSomeRum(){
    if (!live) {
      System.out.println(this.name + "'s dead");
    } else {
      intoxicateAmount++;
    }
  }

  public void howItGoingMate(){
    if (!live){
      System.out.println(this.name +"'s dead");
    } else if(intoxicateAmount < 5 && intoxicateAmount >= 0){
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      sleepItOff();
    }
  }
  public void passItOut(){
    sleepItOff();
  }
  public void sleepItOff(){

  }
  public void die(){
  live = false;
  }
  public void brawl(Pirate otherPirate){
    if (!live) {
      System.out.println(this.name + "'s dead");
    } else if(otherPirate.live){
      int chanceToDie = (int) (Math.random()*3 +1);
      if (chanceToDie == 1){
        this.die();
        System.out.println(this.name + " died");
      } else if(chanceToDie == 2) {
        otherPirate.die();
        System.out.println(otherPirate.name + " died");
      } else {
        this.passItOut();
        otherPirate.passItOut();
        System.out.println(this.name + " and " + otherPirate.name + " passed out!");
      }
    }
  }
}
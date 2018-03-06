package greenfoxinheritance;

public class Sponsor extends Person {

  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.setCompany(company);
    setHiredStudents(0);
  }

  public Sponsor() {
    super();
    setCompany("Google");
    setHiredStudents(0);
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " +getAge() + " year old " + getGender() + " who represents " + getCompany() + " and hired " + getHiredStudents() + " students so far.");
  }

  public void hire() {
    this.hiredStudents ++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}

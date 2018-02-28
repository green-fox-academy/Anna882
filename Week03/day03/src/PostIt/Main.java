package PostIt;

public class Main {
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awsome", "black");
    PostIt postIt3 = new PostIt("yellow", "Super!", "green");
    System.out.println(postIt1.toString());
  }
}

package blogpost;

public class BlogPost {
  private String authorName;
  private String title;
  private String text;
  private String publicatoionDate;

  public BlogPost(String authorName, String title, String text, String publicatoionDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicatoionDate = publicatoionDate;
  }
}
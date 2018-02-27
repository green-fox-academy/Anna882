import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    String fileName = "day02.iml";
    System.out.println(linesInFile(fileName));
  }
  public static int linesInFile(String fileName) {
    Path filePath = Paths.get(fileName);
    try {
      List<String> containOfFile = Files.readAllLines(filePath);
      int linesInFile = containOfFile.size();
      return linesInFile;
    } catch (IOException e) {
      return 0;
    }
  }
  // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
}

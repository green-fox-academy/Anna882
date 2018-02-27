import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    String sourceFileName = "day02.iml";
    String targetFileName = "my-file.txt";
    System.out.println(copyFileFunc(sourceFileName, targetFileName));
  }
  public static boolean copyFileFunc(String sourceFileName, String targetFileName) {
    Path sourcePath = Paths.get(sourceFileName);
    Path targetPath = Paths.get(targetFileName);
    try {
      Files.copy(sourcePath, targetPath);
      return true;
    } catch (IOException e){
      return false;
    }
  }
}
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
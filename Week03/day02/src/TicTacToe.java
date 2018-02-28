
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }
  public static List<String> ticTacResult(String fileName) {
    Path winnerFilePath = Paths.get(fileName);
    List<String> linesOfGameList= new ArrayList<>();
    String linesOfGameString;
    try{
      linesOfGameList = Files.readAllLines(winnerFilePath);
      linesOfGameString = linesOfGameList.toString();
      for (int i = 0; i < linesOfGameString.length(); i++) {

      }
    } catch (IOException e){
    }
    return linesOfGameList;
  }
}
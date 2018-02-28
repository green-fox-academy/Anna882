import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    Path filePath = Paths.get("log.txt");
    List<String> logMessageFromWebserver;
    try {
      logMessageFromWebserver = Files.readAllLines(filePath);
      uniqueIPAdressesFunc(logMessageFromWebserver);
      getPostRatioFunc(logMessageFromWebserver);
    } catch (IOException e) {
      System.out.println("Can not read log file");
    }
  }
  public static String[] uniqueIPAdressesFunc(List<String> logMessageFromWebserver) {
    String[] IPAdressArray = new String[logMessageFromWebserver.size()];
    String[] fullLogMessageLinesArray = new String[logMessageFromWebserver.size()];
    logMessageFromWebserver.toArray(fullLogMessageLinesArray);
    int i = 0;
    for (String line:fullLogMessageLinesArray) {
        String[] temp= line.split("   ");
        IPAdressArray[i] = temp[1];
        i++;
    }
    Arrays.sort(IPAdressArray);
    String[] uniqueIPAdressesArray = {IPAdressArray[0]};
    for (int j = 0; j< IPAdressArray.length-1; j++){
      if (IPAdressArray[j] != IPAdressArray[j+1]) {
        uniqueIPAdressesArray = Arrays.copyOf(uniqueIPAdressesArray, uniqueIPAdressesArray.length+1);
        uniqueIPAdressesArray[uniqueIPAdressesArray.length-1] = IPAdressArray[j+1];
      }
    }
    return uniqueIPAdressesArray;
  }
  public static String getPostRatioFunc(List<String> logMessageFromWebserver) {
    String[] fullLogMessageLinesArray = new String[logMessageFromWebserver.size()];
    logMessageFromWebserver.toArray(fullLogMessageLinesArray);
    int getCounter = 0;
    int postCounter = 0;
    String getPostRequestRatio;
    for (String line : fullLogMessageLinesArray) {
      String[] temp = line.split("   ");
      if (temp[2].equals("GET /")) {
        getCounter++;
      } else if (temp[2].equals("POST /")){
        postCounter++;
      }
    }
    getPostRequestRatio = String.valueOf(getCounter)+"/"+String.valueOf(postCounter);
    return getPostRequestRatio;
  }
}
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
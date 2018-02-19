import java.util.Scanner;

public class Sum {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(sum(userInput));
    }
    public static int sum(int parameter){
        int summary = 0;
        for (int i = 0 ; i <= parameter ; i++) {
            summary = summary + i;
        }
        return summary;
    }

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
}

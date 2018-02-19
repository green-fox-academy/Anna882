import java.util.Scanner;

public class Factorio {
    // - Create a function called `factorio`
//   that returns it's input's factorial
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(factorio(userInput));
    }
    public static int factorio(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

}

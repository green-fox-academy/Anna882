import java.util.Arrays;

public class Printer {
    public static void main (String[] args) {

        printer("one", "two", "three");
    }

    public static void printer(String... printTheseWords) {
        for (String word:printTheseWords) {
            System.out.println(word);
        }
        }
    }

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...


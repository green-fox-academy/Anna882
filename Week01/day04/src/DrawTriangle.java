import java.util.Scanner;

public class DrawTriangle {
    public static void main (String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of lines for the triangle");
        int lines = scanner.nextInt();
        int i = 1;
        String star = "*";

        while (i <= lines ) {
            System.out.println(star);
            star = star + "*";
            i++;
        }
    }
}

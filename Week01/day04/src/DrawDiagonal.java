import java.util.Scanner;

public class DrawDiagonal {
    public static void main (String [] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of lines for the square");
        int lines = scanner.nextInt();
        String pixel = "%";
        String space = " ";
        int row = 1;
        int col = 1;
        String currentRow = "";

        for ( row = 1; row <= lines; row++ ) {
            currentRow = currentRow + pixel;
        }
        System.out.println(currentRow);

        for (row = 2; row < lines; row++) {
            currentRow = "";
            col = 1;
            while (col <= lines) {

                if (col == 1 || col == row || col == lines) {
                    currentRow = currentRow + "%";
                } else {
                    currentRow = currentRow + " ";
                }
                col++;

            }

            System.out.println(currentRow);

        }
        currentRow = "";
        for ( row = 1; row <= lines; row++ ) {
            currentRow = currentRow + pixel;
        }
        System.out.println(currentRow);

    }
}

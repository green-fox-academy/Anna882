import java.util.Scanner;

public class DrawDiagonal {
    public static void main (String [] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of lines for the square");
        int lines = scanner.nextInt();
        String pixel = "%";
        String space = " ";
        int row = 1;
        int col = 1;
        String currentRow = "";


        //Draw the first line
        for ( row = 1; row <= lines; row++ ) {
            currentRow = currentRow + pixel;
        }
        System.out.println(currentRow);



        for (row = 2; row < lines; row++) {
            //After each row the col and the contain of the row (currentRow)
            //have to be reset/
            currentRow = "";
            col = 1;

        //Create the contain of a row
            while (col <= lines) {
                if (col == 1 || col == row || col == lines) {
                    currentRow = currentRow + pixel;
                } else {
                    currentRow = currentRow + space;
                }
                col++;
            }
            //Draw the row
            System.out.println(currentRow);

        }

        currentRow = "";
        // Draw the last row
        for ( row = 1; row <= lines; row++ ) {
            currentRow = currentRow + pixel;
        }
        System.out.println(currentRow);

    }
}

public class DiagonalMatrix {
    public static void main(String[] args) {
        matrix(4);
    }

    public static int[][] matrix(int size) {
        int[][] matrixArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrixArray[i][j] = 1;
                } else {
                    matrixArray[i][j] = 0;
                }
                System.out.print(matrixArray[i][j]);
            }
            System.out.println("");
        }

        return matrixArray;
    }


    }

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
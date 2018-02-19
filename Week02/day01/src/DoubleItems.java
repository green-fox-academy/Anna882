public class DoubleItems {
    public static void main (String[] args) {
        int[] ag = {3, 4, 5, 6, 7};

        for (int number:ag) {
            int i = 0;
            ag[i] = number * 2;
            System.out.print(ag[i] + " ");
            i++;
        }
    }
}

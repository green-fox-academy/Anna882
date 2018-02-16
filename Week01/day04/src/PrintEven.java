public class PrintEven {
    public static void main (String[] args) {

        // Create a program that prints all the even numbers between 0 and 500
        int i = 1;
        while (i <= 500) {
        if ((i % 2 )== 0) {
            System.out.println(i);
        }
        i++;
        }
    }
}
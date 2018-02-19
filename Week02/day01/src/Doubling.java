public class Doubling {
    public static void main(String[] args) {
// - Create an integer variable named `ak` and assign the value `123` to it
        int ak = 123;
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(ak)`
        System.out.println(doubling(ak));

    }
    public static int doubling(int number) {
        int doubleOfTheNumer = number * 2;
        return doubleOfTheNumer;
    }
}

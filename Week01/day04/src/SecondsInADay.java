public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int secondsADay;
        int remainingSeconds;

        secondsADay = 24 * 60 * 60;
        currentMinutes = (currentMinutes + (currentHours * 60));
        currentSeconds = (currentSeconds + (currentMinutes * 60));
        remainingSeconds = secondsADay - currentSeconds;
        System.out.println(remainingSeconds);
    }
}
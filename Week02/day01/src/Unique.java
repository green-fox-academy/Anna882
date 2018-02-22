import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
    public static String unique(int[] numbers) {
        Arrays.sort(numbers);
        int[] uniqueNumbers = {numbers[0]};
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] != numbers[i+1]) {
                uniqueNumbers = Arrays.copyOf(uniqueNumbers, uniqueNumbers.length+1);
                uniqueNumbers[uniqueNumbers.length-1] = numbers[i+1];
            }
        }
        String uniqueNumberList = Arrays.toString(uniqueNumbers);
        return uniqueNumberList;
    }
}
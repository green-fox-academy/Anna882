public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int coding = (17 * 5 * 6);
        System.out.println("An attendee spend " + coding + " hours with coding in a semester.");
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float workingHours;
        workingHours = 52 * 17;
        float valid = coding / workingHours;
        System.out.println("Coding hours is " + valid * 100 + " percentage in the semester");
    }
}
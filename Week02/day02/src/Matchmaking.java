import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static List<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys){
        List<String> girlsAndBoys = new ArrayList<>();
        String[] girlsArray;

        for(int i = 0; i < girls.size()&& i < boys.size(); i++){
            girlsAndBoys.add(girls.get(i));
            girlsAndBoys.add(boys.get(i));
        }
        return girlsAndBoys;
    }
}

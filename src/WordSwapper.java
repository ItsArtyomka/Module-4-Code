/*
 Code that uses Pattern and Matcher class
 to swap words within a phrase.
 In this case, swapping first name and last name.
*/

// Imports
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSwapper {
    public static void main(String[] args) {

        // Phrase that will be "edited".
        String phrase = "Artyom Pionov";

        // Setting up the pattern and "searcher"
        Pattern pattern = Pattern.compile("(.*) (.*)");
        Matcher matcher = pattern.matcher(phrase);

        // Changing up the first group with second group.
        System.out.println(matcher.replaceFirst("$2 $1"));
        /*
         $0 is Artyom Pionov
         Final Output: Pionov Artyom
        */

    }
}

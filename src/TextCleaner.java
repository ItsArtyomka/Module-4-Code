// This class is coded to intake a String and then through RegEx,
// Compile a RedEx that is desired that is then be used to "clean"
// the text.

// Import

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCleaner {
    public static void main(String[] args) {
        // String that will be "cleaned".
        String text = "<strike>Delete this!</strike>This text is good, keep it please.<strike>Not needed either</strike>";

        // Creating and compiling a pattern and creating a pattern matcher "searcher".
        Pattern pattern = Pattern.compile("<strike>.*?</strike>");
        Matcher matcher = pattern.matcher(text);

        // Loop through the String while using the matcher to find "matches" and use Matcher methods
        // Such as start() and end() to find the starting and ending index of the match.
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + end + ".");
        }

        System.out.println("\nCleaning the text...");
        // matcher.replaceAll does two things
        // 1. It replaces the matches with the chosen String aka replacement
        // 2. It outputs the end result.
        System.out.println(matcher.replaceAll(""));
        // Final Output: This text is good, keep it please.
    }
}

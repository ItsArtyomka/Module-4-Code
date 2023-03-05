/*
 This class is coded to intake a String and then through RegEx,
 Compile a RedEx that is desired that is then be used to "clean"
 the text.
*/

// Import
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("SpellCheckingInspection")
public class TextCleaner {
    public static void main(String[] args) {
        // String that will be "cleaned".
        // String text = "<strike>Delete this!</strike>This text is good, keep it please.<strike>Not needed either</strike>";
        String text1 = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";

        // Creating and compiling a pattern.
        // Pattern pattern = Pattern.compile("<strike>.*?</strike>");
        Pattern pattern1 = Pattern.compile("\\bs[a-z]*?s\\b");
        // Creating a pattern "searcher".
        // Matcher matcher = pattern.matcher(text);
        Matcher matcher = pattern1.matcher(text1);

        // Loop through the String while using the matcher to find "matches" and use Matcher methods
        // Such as start() and end() to find the starting and ending index of the match.
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            // System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + end + ".");
            System.out.println("Found match\n" + text1.substring(start, end) + "\nfrom " + start + " to " + end + ".");
        }

        System.out.println("\nCleaning the text...");
        // matcher.replaceAll does two things
        // 1. It replaces the matches with the chosen String aka replacement
        // 2. It outputs the end result.
        System.out.println(matcher.replaceAll(""));
        // Final Output: This text is good, keep it please.
    }
}

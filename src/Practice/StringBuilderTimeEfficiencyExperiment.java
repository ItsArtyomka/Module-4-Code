// This code is used for an experiment to test and measure
// the time it takes for different methods to work certain big number of times.
// Methods used: append(), delete(), insert(0), insert(length/2), setCharAt(), and reverse().
// Common argument that was used - "ABC"
package Practice;

 // This is to make the code look clean with no underlines and small warnings.
@SuppressWarnings({"MismatchedQueryAndUpdateOfStringBuilder", "StringRepeatCanBeUsed", "CommentedOutCode", "unused"})

public class StringBuilderTimeEfficiencyExperiment {
    public static void main(String[] args) {

        // Variables to make it easier to work
        int smallCall = 50_000;
        int mediumCall = 200_000;
        int bigCall = 1_000_000;

        //---Experiment---
        // Creating StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // stringBuilder.append(" "); // <-- This was used for setCharAt() as it would throw IndexOutOfBounds error.

        // Start recording time of the start in milliseconds
        long startTime = System.currentTimeMillis();

        // for loop helps to use methods many times, duh it's a loop for a reason...
        // All the methods that were used to measure their time use are listed below...
        for (int i = 0; i < smallCall; i++) {
            stringBuilder.append("ABC");
            // stringBuilder.delete(0,stringBuilder.length());
            // stringBuilder.insert(0, "ABC");
            // stringBuilder.insert(stringBuilder.length()/2, "ABC");
            // stringBuilder.setCharAt(0, 'A');
            // stringBuilder.setCharAt(0,'A');
        }

        // Printing out the time it took for certain method to work certain amount of time.
        System.out.println((System.currentTimeMillis() - startTime));

    }
}

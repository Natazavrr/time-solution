package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(timeTranslate(1209660));
    }


    public static String timeTranslate(int seconds) {
        if(seconds < 0) {
            throw new ArithmeticException("Time should not be negative.");
        } else if (seconds == 0) {
            return "now";
        } else {
            
            // A string builder is a great thing in java
            StringBuilder sb = new StringBuilder();

            // We're going to introduce a variable here, so that
            // we save a little of CPU power.
            // We don't need any paranthesis here
            int hours = seconds / 60 / 60;

            // using a map here would have been probably better, 
            // but I went with 2 arrays in order not to use any
            // imports, since that might be a requirement by the
            // problem you're trying to solve.
            int[] results = {
                seconds % 60,
                seconds / 60 % 60,
                hours % 24,
                hours / 24 % 365,
                hours / 24 / 365
            };

            String[] timeFrames = {
                "second",
                "minute",
                "hour",
                "day",
                "year"
            };

            for (int i = results.length - 1; i != 0; i--) {                
                // we have basically only 2 cases, for numbers greater
                // than one, and for numbers exactly equal one. In
                // every other case we do nothing.
                if (results[i] > 1) {
                    sb.append(results[i] + " " + timeFrames[i] + "s, ");
                } else if (results[i] == 1) {
                    sb.append(results[i] + " " + timeFrames[i] + ", ");
                }
            }

            // Deleting the trailing comma
            sb.delete(sb.length() - 2, sb.length() - 1);

            return sb.toString();
        }
    }
}

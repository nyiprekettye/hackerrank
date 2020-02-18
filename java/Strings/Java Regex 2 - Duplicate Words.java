/**
task -> https://www.hackerrank.com/challenges/duplicate-word/problem
Pattern.CASE_INSENSITIVE -> https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#CASE_INSENSITIVE
Matcher -> https://docs.oracle.com/javase/7/docs/api/java/util/regex/Matcher.html
Matcher examples1 -> https://www.javatpoint.com/post/java-matcher-group-method
Matcher examples2 -> https://www.geeksforgeeks.org/matcher-group-method-in-java-with-examples/

\w ----> A word character: [a-zA-Z_0-9] <br/>
\W ----> A non-word character: [^\w]<br/>
\b ----> A word boundary  <br/>
\1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)  <br/>
+ ----> Match whatever it's placed after 1 or more times


m.group() is the entire match <br/>
m.group(1) is the 1st match (which is enclosed in the 1st set of parentheses)


regex check -> https://regex101.com/
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}


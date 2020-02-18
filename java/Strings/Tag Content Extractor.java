/**
https://www.hackerrank.com/challenges/tag-content-extractor/problem
Note: [^<]+ is need.
Pattern r = Pattern.compile("<(.+?)>([^<]+)</\\1>");
--------------
<(.+?)> 
--------------
match one or more char after "<" and before the 1st '>', assign to GROUP_ONE
// ?> stop before the 1st '<'
--------------
([^<]+) 
--------------
match one or more char(but not include '<')
assign to GROUP_TWO
//[^<] ^ means NOT '<'
--------------
</\\1>  
--------------
match the same pattern as group 1 within </ ...>
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        
        while (testCases-- > 0) {
            String line = scan.nextLine();
            
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+?)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
    }
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        
        if(s.equals('a')){
            return n;
        }else {
            long lastStringInPos = n % s.length();
            long aNumberInString=0L, aNumberInLastString = 0L;
            int i = 0, pos=0;
            while( i< s.length()){
                char actualChar = s.charAt(i);
                if(actualChar == 'a'){
                    aNumberInString++;
                    if(pos < lastStringInPos)
                        aNumberInLastString++;
                }
            
                i++;
                pos++;
            }
            
            long allANumberInString = aNumberInString * (n / s.length())
            + aNumberInLastString;
            return allANumberInString;
        }       
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

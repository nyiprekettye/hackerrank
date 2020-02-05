import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int res = 0;
        for (int i = 0; i<s.length(); i++){
            for (int j = i+1; j<s.length(); j++){   
                int next = 1;
                while (next+j <= s.length()){
                    char  actChar1[] = s.substring(i,i+next).toCharArray();
                    char  actChar2[] = s.substring(j,j+next).toCharArray();
                    Arrays.sort(actChar1);
                    Arrays.sort(actChar2);                        
                    boolean isMatched = true;
					
                    for(int a=0; a< actChar1.length; a++){
                        if(actChar1[a]!= actChar2[a]){
                            isMatched = false;
                        }
                    }
                    if(isMatched == true){
                        res++;
                    }
                    next++;    
                }
                    
            }

        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

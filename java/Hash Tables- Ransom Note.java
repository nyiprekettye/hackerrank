//https://www.hackerrank.com/challenges/ctci-ransom-note/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> magazineList = new ArrayList<String>(Arrays.asList(magazine));
        

        //int numOfUsedWords=0;
        for (int i = 0; i< note.length; i++){
            boolean actWordIsUsed = false;

            for (int j = 0; j< magazineList.size(); j++){
                if(note[i].equals(magazineList.get(j))){
                    actWordIsUsed = true;
                    magazineList.remove(j);
                    j = magazine.length;
                }
            }

            if(actWordIsUsed == false){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

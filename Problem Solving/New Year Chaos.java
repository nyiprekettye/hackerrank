// https://www.hackerrank.com/challenges/new-year-chaos/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int length = q.length;
        int queue[] = new int[length];
        int allBribes= 0;
        for (int i = 0 ; i < length; i++) 
            queue[i] = i+1;
        
        for (int i = 0 ; i < length-1; i++){
            int bribe = 0;
            while (queue[i + bribe] != q[i]){
                bribe++;
            }
            if(bribe > 2){
                System.out.println("Too chaotic");
                return;
            }
            allBribes += bribe;
            int temp  = queue[i+bribe];
            for ( int j = bribe; j>0; j--){
                queue[i +j] = queue[i +j-1];
            }
            queue[i] = temp;
        }
       System.out.println(allBribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

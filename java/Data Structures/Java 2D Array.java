// https://www.hackerrank.com/challenges/java-2d-array/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int hourglassSum(int[][] arr) {
        int max = 0;
        for(int row =0 ; row < arr.length-2; row++){
            for(int column =0; column < arr[row].length-2; column++){
                int temp = arr[row][column] //top , left 
                    + arr[row][column + 1]   // top , middle 
                    + arr[row][column + 2]   //top, right
                    + arr[row + 1][column + 1]   //middle, middle
                    + arr[row + 2][column]   // botton, left
                    + arr[row + 2][column + 1]   // bottom, middle
                    + arr[row + 2][column + 2];   //bottom, right
                
                if(max <  temp || row == 0 && column ==0)
                    max = temp;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println( hourglassSum(arr));
        scanner.close();
    }
}

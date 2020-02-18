/**
* https://www.hackerrank.com/challenges/java-negative-subarray/problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int k=i;k<n;k++){
                sum=nums[k]+sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


/**
* https://www.hackerrank.com/challenges/java-arraylist/problem
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList[] listArray = new ArrayList[n];
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            listArray[i] = new ArrayList();
            for(int j=0;j<d;j++){  
                listArray[i].add(sc.nextInt());                
            }
        }
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x -1 < listArray.length && y -1  < listArray[x-1].size()){
                System.out.println(listArray[x-1].get(y-1));
            } else {
                System.out.println("ERROR!");
            }

        }
    }
}


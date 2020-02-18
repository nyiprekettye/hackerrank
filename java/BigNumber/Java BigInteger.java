/**
*https://www.hackerrank.com/challenges/java-biginteger/problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       BigInteger a = sc.nextBigInteger();
       BigInteger b = sc.nextBigInteger();
       System.out.println(a.add(b));
       System.out.println(a.multiply(b));
    }
}


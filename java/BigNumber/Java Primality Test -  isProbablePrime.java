// https://www.hackerrank.com/challenges/java-primality-test/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(scanner.nextBigInteger().isProbablePrime(100) 
            ? "prime" : "not prime");

        scanner.close();
    }
}

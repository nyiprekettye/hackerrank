// https://www.hackerrank.com/challenges/java-string-tokens/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNextLine() ){
            System.out.println(0);
            return;
        }
        String s = scan.nextLine();
        // Write your code here.
        String[] splited = s.trim().split("[ !,?.\\_'@]+");

        if(s == null || s.equals("") || s.trim().equals("")){
            System.out.println("0");
        } else if(s.length() > 400000){
            return;
        } else{
            System.out.println(splited.length);
        }

        for(int i = 0; i < splited.length; i++){
            System.out.println(splited[i]);
        }

        scan.close();
    }
}


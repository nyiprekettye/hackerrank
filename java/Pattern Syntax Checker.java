// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.nextLine());
        
		while(a>0){
			String pattern = in.nextLine();    
            try
            {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException ex)
            {
                System.out.println("Invalid"); 
            }
            a--;
		}
	}
}
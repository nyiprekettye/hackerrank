// https://www.hackerrank.com/challenges/java-dequeue/problem
import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		HashSet<Integer> hasSet = new HashSet<>();

		int n = in.nextInt();
		int m = in.nextInt();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			int num = in.nextInt();
			deque.add(num);
			hasSet.add(num);
			if(i >= m-1){
				if(hasSet.size() > max){
					max = hasSet.size();
				}
				
				int first = (int)deque.getFirst();
				deque.remove();
				if(!deque.contains(first)){
					hasSet.remove(first);
				}
			}

		}
		System.out.println(max);
	}
}




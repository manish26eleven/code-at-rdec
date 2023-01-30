// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;

// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		Scanner in=new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}
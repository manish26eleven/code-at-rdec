/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
        public class int calcp(int x,int n) {
                if(n==0) {
                        return 1;
                }
                if(x==0) {
                        return 0;
                }
                if(n%2==0) {
                        return calcp(x,n/2)*calcp(x,n/2);
                }
                else {
                        return calcp(x,n/2)*calcp(x,n/2)*x;
                }
        }
	public static void main(String[] args) {
	        int x=2, n=5;
	      int ans = calcp(x,n);
		System.out.println(ans);
	}
}


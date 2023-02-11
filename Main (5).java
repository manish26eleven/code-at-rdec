/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
        public static void printfib(int a,int b,int n) {
                if(n==0) {
                        return;
                }
               int c=a+b;
               System.out.println(c);
               printfib(b,c,n-1);
        }
	public static void main(String[] args) {
	        int a=0;
	        int b=1;
		System.out.println(a);
		System.out.println(b);
		int n=15;
		printfib(a,b,n-2);
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(b<a & a<c) {
		        System.out.println("Take second dose now");
		        if(a>c) {
		            System.out.println("Too late");
		            if(a<b) {
		                System.out.println("Too early");
		                t--;
		            }
		        }
		    }
		}
	}
}

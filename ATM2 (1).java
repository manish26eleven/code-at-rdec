/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		    int a = sc.nextInt();
		    int b= sc.nextInt();
		    while(a-->0) {
		        int c=sc.nextInt();
		        if(b>=c) {
		            System.out.print("1");
		            b =b-c;
		        } else {
		            System.out.print("0");
		        }
		    }
		    System.out.println();
		}
	}
}

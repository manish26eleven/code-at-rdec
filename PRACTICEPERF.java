

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
	
		int a[] = new int[4];
		int c = 0;
		for(int i = 0; i<4; i++){
		    a[i] = sc.nextInt();
		}
		int j = 0;
	    while(j<4){
	        if(a[j] >= 10){
	            c++;
	        }
	        
	        j++;
	    }
	
		System.out.println(c);
		
	}
}
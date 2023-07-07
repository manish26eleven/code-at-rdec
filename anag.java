/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//import java.

/* Name of the class has to be "Main" only if the class is public. */
public class anag
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			String arr[][] = new String[3][3];
			int count=0;

			for(int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					arr[i][j] = sc.next();
				}
			}
			
			
			for(int i=0;i<3;i++) {
				if((arr[i][0]== arr[i][1])&&(arr[i][1]==arr[i][2])&&(arr[i][0]==arr[i][2])) {
					if(arr[i][0].charAt(0)!='.') {
					System.out.println(arr[i][0]);
					
					count++;
					}
				}
			}
			for(int i=0;i<3;i++) {
				if((arr[0][i]== arr[1][i])&&(arr[1][i]==arr[2][i])&&(arr[0][i]==arr[2][i])) {
					if(arr[0][i].charAt(0)!='.') {
					System.out.println(arr[0][i]);
					
					count++;
					}
				}
			}
			if((arr[0][0]== arr[1][1])&&(arr[1][1]==arr[2][2])&&(arr[0][0]==arr[2][2])) {
				if(arr[1][1].charAt(0)!='.') {
				System.out.println(arr[0][0]);
				
				count++;
				}
			}
			if((arr[0][2]== arr[1][1])&&(arr[1][1]==arr[2][0])&&(arr[0][2]==arr[2][0])) {
				if(arr[1][2].charAt(0)!='.') {
				System.out.println(arr[1][1]);
				
				count++;
				}
			}
			if(count==0) {
				System.out.println("DRAW");
			}


		}
			
		}
	}


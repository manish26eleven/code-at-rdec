/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner=new Scanner(System.in);
	int testcase=scanner.nextInt();
	for(int i=0;i<testcase;i++){
	     char a = scanner.next().charAt(0);
	     if(a=='b'||a=='B') System.out.println("BattleShip");
	     if(a=='c'||a=='C') System.out.println("Cruiser");
	     if(a=='d'||a=='D') System.out.println("Destroyer");
	     if(a=='f'||a=='F') System.out.println("Frigate");
	}
	}
}


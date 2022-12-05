/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int numbers[] = new int[size];
	        for(int i = 0; i < size; i++) {
	                numbers[i] = sc.nextInt();
	        }
	        int x = sc.nextInt();
	        for(int i = 0; i < numbers.length; i++) {
	                if(numbers[i] == x) {
	                        System.out.println("x is found at "+ i);
	                }
	        }
	}
}
	  
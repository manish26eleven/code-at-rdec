/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	        
for(int i =1; i <=4; i++) {
            for(int j =1; j <=i; j++ ) {
                System.out.print("*");
            }
            int spaces =8-2*i;
            for(int j =1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =4; i >=1; i--) {
            for(int j =1; j <=i; j++ ) {
                System.out.print("*");
            }
            int spaces =8-2*i;
            for(int j =1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
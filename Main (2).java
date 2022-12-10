/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] matrix = new int[row][col];
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                matrix [i][j] = sc.nextInt();
                System.out.println();
            }
        }
        int x= sc.nextInt();
        for(int i = 0; i<row; i++) {
            for(int j = 0; j < col; j++) {
                if(x == matrix [i][j]) {
                    System.out.print("x is found at " + i +" " + j);
                }
            }
        }
    }
}

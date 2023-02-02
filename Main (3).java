/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main {
    public static void printarray(int arr[]) {
        for(int i =0;i < arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        for(int i =0;i <arr.length-1;i++) {
            int t = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[t]>arr[j]) {
                      t= j;
                }
            }
            int temp = arr[t];
            arr[t] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }
}
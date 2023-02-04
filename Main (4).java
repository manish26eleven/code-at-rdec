/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
        public static void printarray(arr[]) {
                for(int i=0;i<arr.length;i++) {
                        System.out.println(arr[i]+" ");
                }
        }
	public static void main(String[] args) {
		int arr[] ={7,8,3,1,2};
		for(int i=0;i<arr.length;i++) {
		        int current = arr[i];
		        int j =i-1;
		        while(j >=0 && arr[current] <arr[j]) {
		                arr[j+1] = arr[j];
		                j--;
		        }
		        arr[j+1] = current;
		}
		printarray(arr);
	}
}

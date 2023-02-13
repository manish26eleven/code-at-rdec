/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
        public static void tower(int n,String src,String helper,String dest) {
                if(n==1) {
                        System.out.println("transfer disk 1"+ "from"+ src +"to"+dest);
                        return;
                }
                tower(n-1,src,dest,helper);
                System.out.println("transfer disk"+ n +"from" + src + "to" + dest);
                tower(n-1,helper,src,dest);
        }
	public static void main(String[] args) {
		int n=3;
		tower(n,"s","h","d");
	}
}

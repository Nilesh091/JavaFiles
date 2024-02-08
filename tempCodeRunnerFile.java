import java .util.*;
class Codechef
{
    public static int check(int n){
        int k=0;
        while(n>=1){
            k++;
            n=n/2;
        }
        return k;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i:arr){
		    System.out.println(check(i));
		}
	}
}


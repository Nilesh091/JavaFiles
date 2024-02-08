import java.util.Scanner;

public class codechef {
    public static int check(int arr[],int k){
        int mul=1;
        for(int s:arr){
            mul*=(k-s);
        }
        return mul;
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int i= sc . nextInt();
		int j= sc . nextInt();
		int arr[]= new int[i];
		for(int k=0;k<i;k++){
		    arr[k]=sc.nextInt();
		}
		int arr1[]=new int[j];
		for(int l=0;l<j;l++){
		    arr1[l]=sc.nextInt();
		}
		for(int nr:arr1){
		    if(check(arr,nr)>0){
		        System.out.println("POSITIVE");
		    }
		    else if(check(arr,nr)<0){
		        System.out.println("NEGATIVE");
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}

import java.util.Scanner;

public class evenodd_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int k=1;
        int l=2;
        for(int i=0;i<=n/2;i++){
            arr[i]=k;
            k=k+2;
        }
        for(int i=n/2+1;i<n;i++){
            arr[i]=l;
            l=l+2;
        }
        for(int i:arr){
            System.out.print(i);        
        }
    }
}

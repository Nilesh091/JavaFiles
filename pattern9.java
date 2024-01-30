import java.util.Scanner;
// 4
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10

public class pattern9 {
    public static void main(String[] args) {
        int k=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                k+=j;
                if(j==1)
                System.out.print(j);
                else
                System.out.print("+"+j);
            }
            System.out.println("="+k);
            k=0;
        }
    }
}

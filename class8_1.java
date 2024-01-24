import java.util.Scanner;

public class class8_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0){ //1
        System.out.println("number is negative");
        }
        else if(a>0)
        System.out.println("number is Positive");
        else
        System.out.println("number is zero");
    }
}

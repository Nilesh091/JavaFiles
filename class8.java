import java.util.*;
public class class8 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%2==0){ //1
    System.out.println("number is even");
    }
    else{
    System.out.println("You ar in the else block");
    System.out.println("number is odd");
    }

    if(a<0){ //1
      System.out.println("number is negative");
    }
    else if(a>0){
      System.out.println("number is  Positive");
       //System.out.println("number is  Positive");
}
    else
       System.out.println("number is  zero");
       System.out.println("Program is terminated ");
    
    }
}

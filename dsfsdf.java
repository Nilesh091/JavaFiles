import java.util.Scanner;

/**
 * Innerdsfsdf
 */
interface MathOperation {
    int calculate(int n);
    
}

class SquareOperation implements MathOperation{
    public int calculate(int n){
        return n*n;
    }
}
class SumOperation implements MathOperation{
    public int calculate(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}

public class dsfsdf {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        // String s=sc.nextLine();
// char ch=sc.nextLine().charAt(0);
// System.out.println(ch);
        // MathOperation squareOperation = new SquareOperation();
        // MathOperation sumOperation = new SumOperation();

        // System.out.println(squareOperation.calculate(5)); // 
        // System.out.println(sumOperation.calculate(5));
    }
}

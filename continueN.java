public class continueN {
    public static void main(String[] args) {
        int a=1;
        while (a<=5) {
            if (a==3) {
                a++;
                continue;
            }
            
                System.out.println(a);
            
            a++;
        }
    }
}

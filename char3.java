public class char3 {
    
    public static void main(String[] args) {
        int k=65;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(k++));
            }
            System.out.println();
        }
    }
}

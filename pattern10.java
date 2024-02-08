public class pattern10 {
    public static void main(String[] args) {
        int n=4;
        
        for(int i=0;i<n;i++){
            for(int j=(2*i+1);j<2*n;j+=2){
                System.out.print(j);
            }
            for(int j=1;j<i*2+1;j+=2){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}

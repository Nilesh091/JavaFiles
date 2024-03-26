public class feb13 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]=new int[arr.length];
        
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                if(j!=i){
                    sum+=arr[j];
                }
            }
            arr2[i]=sum;
        }
        for(int i=0;i<4;i++){
            System.out.println(arr2[i]);
        }
    }
}

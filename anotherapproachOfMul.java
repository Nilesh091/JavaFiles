public class anotherapproachOfMul {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int mul=1;
        for(int i=0;i<5;i++){
            mul*=arr[i];
        }
        for(int i=0;i<5;i++){
            arr[i]=mul/arr[i];
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}

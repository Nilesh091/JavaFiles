public class pattern1usingWhileloop {
    public static void main(String[] args) {
        int i=0,j=0;
        while (i<4) {
            while (j<4) {
                System.out.print(4+" ");
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }
    }
}

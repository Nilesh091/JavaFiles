public class pattern2withwhile {
    public static void main(String[] args) {
        int i=1,j=1;
        while (i<=4) {
            while (j<=4) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
    }
}

public class str1 {
    public static void main(String[] args) {
        int n=0;
        String str="Hello world";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                n++;
            }
        }
        
        String arr[]=new String[n];
    }
}

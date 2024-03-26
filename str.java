public class str {
    public static void main(String[] args) {
        String m=new String("Hello world");
        String str="";
        for(int i=m.length()-1;i>=0;i--){
            str+=m.charAt(i);
        }
        System.out.println(str);
    }
}

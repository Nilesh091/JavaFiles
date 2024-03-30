import java.util.*;
public class Date_AndTime_Function {
    public static void main(String[] args) {
        Date m=new Date();
        System.out.println(m);
        Date d1 = new Date(2000, 11, 21); 
        // System.out.println(d1);
        // System.out.println(m.after(d1));
        // System.out.println(d1.after(m));
        // System.out.println(m.after(m));
        System.out.println(d1.compareTo(m));


    }
}

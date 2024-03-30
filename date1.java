
    import java.util.*;
import java.time.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
//millisecond from 1 jan 1970
//millisecond Long
public class date1 { //d1 ->d3 ->d2
public static void main(String[] args) {
Date currentDate=new Date();
// LocalDate local=currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
// System.out.println(local);

String dateString="2024-03-27";
DateTimeFormatter fm=DateTimeFormatter.ofPattern("yyyy-MM-dd");

LocalDate local=LocalDate.parse(dateString,fm);
System.out.println(local);
// Date d =new Date();
// Date d1 =new Date();
// Date d2=new Date(1512320000000L);
// Date d3=new Date(1812320000000L);
// // System.out.println( d1);
// // System.out.println( d2);
// // System.out.println( d3);
// // System.out.println( d1.after(d2));
// // System.out.println( d2.after(d1));
// // System.out.println( d2.before(d3));
// // System.out.println( d3.before(d2));
// // System.out.println(d1.compareTo(d));
// // System.out.println("smaller date " + d1.compareTo(d2));
// // System.out.println("date coming after " + d1.compareTo(d3));
// System.out.println( d1);
// d1.setTime(1456869870705L);
// System.out.println( d1);

// obj.setHours(10);
// obj.setMinutes(20);
// obj.setSeconds(54);


// Date obj1=new Date(24512320000000L);
// Date obj2=new Date(2011,10,20);
//addition of millisecond in time 00 hours 1 jan 1970

// System.out.println("current date is" + obj);
// System.out.println("created date is" + obj1);
// System.out.println("created date is" + obj2);
}
}


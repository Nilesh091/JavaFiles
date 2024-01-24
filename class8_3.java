import java.util.Scanner;

public class class8_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        switch(str){
        case "Monday" ,"tuesday" : {
        System.out.println("class from 7 to 9pm");
        break;
        }
        case "wednesday" : {
        System.out.println("class from 7pm to 8pm");
        break;
        }
        
        case "Thursday","friday","saturday","sunday" : {
        System.out.println("No class");
        break;
        }

        default : System.out.println("invalid input");

    }
}
}
import java.util.*;

public class Interfaces {
    public static void main(String[] args) {
      C obj=new C();
      obj.print();
     // 
  }
}
interface I1{
     default void print(){
      System.out.println("inside I1 print");
    } 
}
interface I2 extends I1{
  // default void print(){
  //     System.out.println("inside I2 print");
  //   } 
}
interface I3 extends I1{
  // default void print(){
  //     System.out.println("inside I3 print");
  //   } 
}
  class C implements  I2,I3{
  // public void print(){
  //     System.out.println("inside class print");
  //   } 
}



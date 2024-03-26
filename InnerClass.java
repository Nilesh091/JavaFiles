

class outer{
    static int b;
    private void print(){
        System.out.println("Outer");
    }
    class inner{
        static int a;
        void show(){
            System.out.println("Inner");
            print();
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        // outer.inner obj=new outer().new inner();
        // //outer obj=new outer();
        // //obj.show();
        // System.out.println(obj.a);
        System.out.println(outer.b);
        //System.out.println(inner.a); //(Wrong)there is no significance of defining static in an inner class
    }
}

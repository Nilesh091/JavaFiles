public class n {
    
        public static void main(String[] args) {
            // if (args.length != 3) {
            //     System.out.println("Usage: java QuadraticEquationSolver <a> <b> <c>");
            //     return;
            // }
    
            // double a = Double.parseDouble(args[0]);
            // double b = Double.parseDouble(args[1]);
            // double c = Double.parseDouble(args[2]);
                double a= 3.2,b=6.4,c=2.7;
            double discriminant = b * b - 4 * a * c;
    
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("First root is: " + root1 + " Second root is: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Roots are equal and value is: " + root);
            } else {
                System.out.println("Roots are imaginary");
            }
        }
    }
    


import java.util.Scanner;
public class Quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-efficents of quadratic equation:");
        System.out.print("co-efficent of a: ");
        double a=sc.nextDouble();
        System.out.print("co-efficent of b: ");
        double b=sc.nextDouble();
        System.out.print("co-efficent of c: ");
        double c=sc.nextDouble();
        double dis =b*b-4*a*c;
        if (dis ==0){
            double root = -b/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("roots : "+root);
        }
        else if (dis > 0){
            double r1=(-b+Math.sqrt(dis))/(2*a);
            double r2=(-b-Math.sqrt(dis))/(2*a);
            System.out.println("Roots are real and distint :");
            System.out.println("r1: "+r1);
            System.out.println("r2: "+r2);
        }
        else{
            double realpart = -b/(2*a);
            double imgpart = (Math.sqrt(-dis))/(2*a);
            System.out.println("Roots are complex");
            System.out.println("Root 1 :"+realpart+"+"+imgpart+"i");
            System.out.println("Root 2 :"+realpart+"-"+imgpart+"i");
        }
        sc.close();
    }
}

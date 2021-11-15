import java.util.Random;
import java.util.Scanner;

public class less2 {
    //1.Write a program
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Enter a");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter alpha");
        double alpha = input.nextDouble();




        //double x = 4*5*6;
        //int x = multiply(a,b, c);

        System.out.println("Res " + a*b*Math.sin(alpha));
    }

    static int multiply(int x1, int x2, int x3){
        int m = x1*x2*x3;
        return m;
    }

    static void random(){
        Random r = new Random();
        int rand = r.nextInt();

    }



}

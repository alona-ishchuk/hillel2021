package HomeWorks;

import java.util.Scanner;

public class hw2_1 {

    public static void main(String[] args){
        //task4();

    }

    //Write a program which divide 2 fractional numbers and print results in console
    static void task1(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a = ");
        double a = input.nextDouble();
        System.out.println("Enter b = ");
        double b = input.nextDouble();

        System.out.println("The result of divide: a/b = " + a/b);
    }

    //Write a program which count the volume of cylinder and print result in console. Radius and height user input from console
    static void task2(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the h, cm ");
        double h = input.nextDouble();
        System.out.println("Enter the, R, cm ");
        double r = input.nextDouble();

        if( h<0 || r<0)
            System.out.println("The value of h,r should be positive");

        else
        System.out.println("V = "+ Math.PI*r*r*h+ " cm3");
    }

    //Write a program which converts number from hex to decimal view (input in command line)
    static void task3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hex");
        String hex = input.nextLine();
        System.out.println("In disimal is " + Integer.parseInt(hex, 16));
    }

    /*Create your own example with increment/decrement, count it manually and then run program and verify your value.
    Example has to contain more then 5 increment operation, more then 5 decrement operations, *=, +=, -=,
    and more then 5 resetting of value for each variable.
     */
    static void task4(){
        int a = 10, b = 5;
        b = ++b * a++; //11 60
        b= b/ --a; // 10 6
        b = b - --b + --a; //9 10
        b = --a + a-- / --a;//6 9
        a = b-- * ++b/--a; //16 9
        a = --a - b++; //6 10
        a = b/--a * --b - ++a; // 12 9
        a = b++ - (++a - --a) ;// 8 10
        b = --b * (++b - a--) / --a; // 6 3
        a = (--a + b--)/ b--; //4 1
        System.out.println(a + " " + b );
    }

    //Write a program which count x1, x2 for quadratic equation. Input a, b, c from console
    static void task5(){
        System.out.println("Input a,b,c from quadratic equation: ax^2 + bx + c = 0");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ");
        double a = input.nextDouble();
        System.out.println("Enter b ");
        double b = input.nextDouble();
        System.out.println("Enter c ");
        double c = input.nextDouble();

        double x1 = 0 , x2 = 0;

        double d = b*b - 4*a*c;
        if(d <0 ){
            System.out.println( "There are no real roots. D = "+ d );
        }
        else {
            x1 = ((-1) * b + Math.sqrt(d)) / (2 * a) ;
            x2 = ((-1) * b - Math.sqrt(d)) / (2 * a) ;
            if (d == 0) {
                System.out.printf("There are one root: x = %.2f %n", x1);
            } else {
                System.out.printf("D = %.2f There are 2 roots: \n x1 = %.2f %n \n x2 = %.2f %n",d, x1, x2);
            }
        }


    }

}

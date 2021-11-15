package HomeWorks;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Hw8 {

        public static void main(String[] args){

            task3();
        }


        /*Write a program to compute the value of Eiler number, using the following series expansion.

Use the maximum denominator as the terminating condition. Try maxDenominator of 1000, 10000, 100000,

HINT: e=1/0!+1/1!+1/2!+1/3!+1/4!+1/5!+1/6!+...*/
    public static void task1() {
        int max = 1000;
        double fact = 1;
        double ep = 1;
        for (int i = max; i > 0; i--) {
            fact = 1;
            for (int y = i; y > 0; y--) {
                fact *= y;
            }
            ep += 1.0 / fact;
            System.out.println(i+"! = "+1.0/fact);

        }
        System.out.println(" = " + ep);
    }





        // Write a program called Tribonacci to print the first 20 Tribonacci numbers
    //0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504 ....

        public static void task2() {
            int n0 = 0;
            int n1 = 0;
            int n2 = 1;
            int nextFib = 0;

            int n = 20;
            System.out.print(n0+ ", " + n1 +", " + n2);

            for(int i = 0; i < n-3; i++){
                nextFib = n0+n1+n2;
                n0 = n1;
                n1 = n2;
                n2 = nextFib;
                System.out.print(", "+ nextFib);

            }

        }


        /*Write 4 programs called TriangularPatternX (X = A, B, C, D) that prompts user for the size
        (a non-negative integer in int); and prints each of the patterns as shown on picture below*/
    public static void task3() {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter option: A, B, C, D");
            char option = Character.toLowerCase(inp.nextLine().charAt(0));
            //char option = Character.toLowerCase(input);
            System.out.println("Enter size of the triangular (positive) more than 2");
            int size = inp.nextInt();
            final char a = 'a', b = 'b', c = 'c', d = 'd';

            if (size < 2 || (option != a && option != b && option != c && option != d) )
                return;

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {

                    if ((option == a && j < i + 1) ||
                            (option == b && j < size - i)
                    )
                        System.out.print("# ");

                    if (option == c || option == d ){

                        if ((option == d && (j < (size - 1) - i)) ||
                                (option == c && j < i))
                            System.out.print("  ");
                        else
                            System.out.print("# ");
                    }
                }
                System.out.println();
            }
        }

        /* Write a program to extract each digit from a double, in the reverse order.

            For example, if the double is 2522.43034, the output shall be " 4 3 0 3 4 . 2 2 5 2",
            with a space separating the digits.
         */

    public static void task4(){

        System.out.println("Enter fractional number");
        Scanner inp = new Scanner(System.in);
        double num = inp.nextDouble();
        String str = Double.toString(num);
        System.out.println( new StringBuilder(str).reverse().toString());

    }


    //Write program which print out next image using loops: n = 5
    public static void task5(){
        int n = 5;

        for(int i = 0; i < n; i++){
            System.out.println();
            for(int y = 0, space = n-1-i; y < 5; y++, space--){
                if(space > 0 ){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
        }

    }




}

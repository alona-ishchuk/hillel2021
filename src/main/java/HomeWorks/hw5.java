package HomeWorks;

import java.util.Locale;
import java.util.Scanner;

public class hw5 {

    public static void main(String[] args){

task1();
    }


    //Write a program which take four numbers from the user and print out just that few of them which divide by 3 or 5 without remainder

    public static void task1(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter 1th number ");
        int num1 = input.nextInt();
        System.out.println(" Enter 2nd number ");
        int num2 = input.nextInt();
        System.out.println(" Enter 3rd number ");
        int num3 = input.nextInt();
        System.out.println(" Enter 4th number ");
        int num4 = input.nextInt();



            divide3_5(num1);
            divide3_5(num2);
            divide3_5(num3);
            divide3_5(num4);



    }
    public static void divide3_5( int num){
        if((num % 3 == 0 || num % 5 == 0 )&& num !=0){
            System.out.println(num);
        }

    }

    /* Write a program which take string from console and print out whether it contains numbers, uppercase symbols,
    lowercase symbols, special characters (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)
     */

    public static void task2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string ");
        String str = input.nextLine();
        //char other = ' ';

        String strUp = " without Uppercase symbols, ";
        String strLow = "without Lowercase symbols, ";
        String strNum = "without Numbers, ";
        String strSpec = "without special characters.";

        boolean isUpper = false;
        boolean isLow = false;
        boolean isNum = false;
        boolean isSpec = false;

        for(int i = 0; i < str.length(); i++) {
            if(!isSpec) {
                if ((str.charAt(i) > 32 && str.charAt(i) < 48) ||
                        (str.charAt(i) > 57 && str.charAt(i) < 65) ||
                        (str.charAt(i) > 90 && str.charAt(i) < 97) ||
                        (str.charAt(i) > 122 && str.charAt(i) < 127)) {
                    isSpec = true;
                    strSpec = "with special characters.";
                }
            }
            if(!isNum) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    isNum = true;
                    strNum = "with Numbers, ";
                }
            }

            if(!isUpper) {
                if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                    isUpper = true;
                    strUp = " with Uppercase symbols, ";
                }
            }

            if(!isLow) {
                if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                    isLow = true;
                    strLow = "with Lowercase symbols, ";
                }
            }

            if( isSpec && isLow && isNum && isUpper){
                i = str.length();
            }
        }
       System.out.println("The string: " + str + strUp + strLow +strNum + strSpec);


    }

    // Write a Java program that takes a year from user and print whether that year is a leap year or not.

    public static void task3(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter year");
        int year = input.nextInt();

        String out = year%4 == 0? "Is a leap year": "Is not leap year";
        System.out.println(out);

    }


    // Write a program which take number of month from user and print out name of season (summer, winter ...)

    public static void task4(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter number of month");
        int month = input.nextInt();

        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("vesna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("outum");
                break;
            default:
                System.out.println("the number of month isn't correct");
                break;

        }

    }


    /*Write the program which take name of color from user (red, blue, green, yellow, orange, black, white, pink) and print out length of this word.
    You can’t use .length() of String. Use switch operator
     */

    public static void task5(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter ame of color");
        String color = input.nextLine().toLowerCase();

        switch(color){
            case "red":
                System.out.println("The length of " + color +" is 3");
                break;
            case "blue":
            case "pink":
            System.out.println("The length of the " + color +" is 4");
                break;
            case "green":
            case "black":
            case "white":
                System.out.println("The length of the " + color +" is 5");
                break;
            case "yellow":
            case "orange":
                System.out.println("The length of the " + color +" is 6");
                break;
            default:
                System.out.println("This name " + color + " isn't detected in the database");
                break;

        }


    }
}

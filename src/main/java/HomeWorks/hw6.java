package HomeWorks;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args){

//task14();
    }

    //Определить четность вводимого с клавиатуры числа
    public static void task1(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = inp.nextInt();

        System.out.println( num %2 == 0? "The even": "the odd");

    }

    //Ввести два числа и найти меньшее из них.
    public static void task2(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = inp.nextInt();
        System.out.println("Enter second number ");
        int num2 = inp.nextInt();

        System.out.println( num1 > num2 ?"The first is bugger = " + num1: "the second is bigger = " + num2);

    }


    //Определить знак введённого числа.
    public static void task3(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = inp.nextInt();

        System.out.println( num >= 0? "The positive": "the negative");

    }


    //Ввести три числа и найти наибольшее из них.
    public static void task4(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = inp.nextInt();
        System.out.println("Enter second number ");
        int num2 = inp.nextInt();
        System.out.println("Enter third number ");
        int num3= inp.nextInt();

        int maxNum = Math.max(num1, num2);
        System.out.println(maxNum > num3 ? "The biggest number is " + maxNum : "The biggest number is " + num3);

    }

    /* Реализовать калькулятор. Вводятся 2 дробных числа a и b. Необходимо вывести на экран меню с пунктами:
    1) a + b 2) a – b 3) a * b 4) a / b.
    При выборе соответствующего пункта меню происходит вывод результата вычисления.
     */
    public static void task5(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number ");
        double num1 = inp.nextDouble();
        System.out.println("Enter second number ");
        double num2 = inp.nextDouble();
        System.out.println("Chose the operation: \n 1) a + b\n 2) a – b\n 3) a * b\n 4) a / b\n Enter number 1 - 4");
        int option = inp.nextInt();
        double res = 0;

        switch(option){
            case 1:
                res = num1+num2;
                break;
            case 2:
                res = num1 - num2;
                break;
            case 3:
                res = num1 * num2;
                break;
            case 4:
                res = num1/num2;
                break;
            default:
                System.out.println(" Incorrect value. You need enter value 1-4. Your data is " + option);
                break;
        }

        System.out.println(option > 0 && option < 5? "Your result is " + res: " ");


    }

    //Ввести с клавиатуры символ. Определить является ли он цифрой.
    public static void task6(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter one symbol");
        int num = 0;
        boolean isOneSymbol = false;
        String str =inp.nextLine();
        if(str.length() == 1){
            num = str.charAt(0);
            isOneSymbol = true;
        }
        else {
            System.out.println("Isn't one symbol");
        }

        System.out.println( isOneSymbol && Character.isDigit(str.charAt(0))? "The value is digit" + num: "" );

    }

    //Ввести с клавиатуры число и проверить, принадлежит ли это число диапазону от 1 до 30
    public static void task7(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = inp.nextInt();

        System.out.println( num >= 0 && num < 31 ? "the number "+ num +" belongs interval 1-30": "the number "+ num +" doesn't belongs interval 1-30");

    }

    //Написать программу для проверки кратности числа X числу Y (оба числа вводятся с клавиатуры).
    public static void task8(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter x number ");
        int x = inp.nextInt();
        System.out.println("Enter y number ");
        int y = inp.nextInt();

        System.out.println( x%y == 0? "X кратно числу Y": "X не кратно числу Y");

    }

    //Ввести с клавиатуры символ. Определить, является ли введённый символ буквой либо знаком пунктуации
    public static void task9(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter symbol ");
        char sym = inp.nextLine().charAt(0);
        boolean isLetterOrChar = false;


                if(Character.isLetter(sym)){
            System.out.println("Буквa: " + sym);
                isLetterOrChar = true;}
                if(sym == '.' || sym == ',' || sym == ';' || sym == ':' || sym == '-' || sym == '!' || sym == '?'
                        || sym == '"' ||sym == '\'' ){
                    System.out.println("знак пунктуации: " + sym);
                    isLetterOrChar = true;
                }

        System.out.println(!isLetterOrChar? sym + " - Не буква или знак пунктуации ": "");

    }


    //Ввести число и определить кратно ли оно 3, 5, 7.
    public static void task10(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = inp.nextInt();

        if(num%3 == 0 || num % 5 == 0 || num % 7 ==0){
            if(num % 3 == 0){
                System.out.println(num +" кратно 3 ");
            }
            if(num % 5 == 0){
                System.out.println(num +" кратно 5 ");
            }
            if(num % 7 == 0){
                System.out.println(num +" кратно 7 ");
            }
        }
        else{
            System.out.println(num + " не кратно ни 3, ни 5, ни 7");
        }

    }



    //Определить модуль введённого числа.
    public static void task11(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = inp.nextInt();

        System.out.printf("Модуль числа %d = %d", num, Math.abs(num));


    }

    //Вводится целое число (не более 4 разрядов). Определить количество цифр в нём.
    public static void task12(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number no more than 4 digits");
        int num = inp.nextInt();

        if(num < 10000){
            if (num > 999 ){
                System.out.println(num + " :count of digits is 4 ");
            }
            else {
                if (num > 99) {
                    System.out.println(num + " :count of digits is 3 ");
                }
                if (num > 9 && num < 100){
                    System.out.println(num + " :count of digits is 2 ");
                }
                if (num < 10){
                    System.out.println(num + " :count of digits is 1 ");
                }
            }
        }
        else{
            System.out.println(num + " :count of digits is more than 4 ");
        }

    }

    //В Ввести с клавиатуры пятизначное число и определить, является ли оно палиндромом,
    // т.е. одинаково читается в обоих направлениях (например, 12321 – палиндром, 12345 – не палиндром).
    public static void task13(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Ввести с клавиатуры пятизначное число ");
        int num = inp.nextInt();
        int myNum = num;
        String str = String.valueOf(num);


        if (num  < 100000 && num > 9999) {
            System.out.println((num/10000
                    + ((num = num%10000)/1000) * 10
                    + ((num = (num%1000))/100) *100
                    + ((num = num%100)/10) * 1000
                    + ((num = num%10)) * 10000) == myNum? myNum +" palindrome ": myNum + " not palindrome");

        }
        else{
            System.out.println("The number contains more or less than 5 digits");
        }


    }

    //Пользователь задаёт координаты вершин прямоугольника, а также координаты точки (X,Y) в декартовой системе координат.
    // Принадлежит ли точка этому прямоугольнику?
    public static void task14(){
        Scanner inp = new Scanner(System.in);
        System.out.println("введите координаты верхнего левого угла прямоугольника \n x: ");
        int x0 = inp.nextInt();
        System.out.println("y: ");
        int y0 = inp.nextInt();
        System.out.println("введите координаты правого нижнего угла прямоугольника \n x: ");
        int x1 = inp.nextInt();
        System.out.println("y: ");
        int y1 = inp.nextInt();
        System.out.println("введите координаты точки \n x:");
        int xp = inp.nextInt();
        System.out.println("y: ");
        int yp = inp.nextInt();

        //boolean isOwn = false;

        if( (xp > x0 && xp < x1) && (yp > y0 && yp < x1)) {
            System.out.printf(" The point with (%d, %d)coordinates belongs to rectangle with coordinates : top left corner (%d, %d) and bottom right corner (%d, %d),", xp, yp, x0, y0, x1, y1);
        }
        else{
            System.out.println("The point (%d, %d) doesn't belong to this rectangle");
        }


    }

}

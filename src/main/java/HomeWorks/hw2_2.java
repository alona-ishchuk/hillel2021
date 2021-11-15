package HomeWorks;

import java.util.Scanner;

public class hw2_2 {

    public static void main(String[] args){
        //task1(1, 7.19f, 10);
        task2();

    }

    /* Ввести длину, ширину и высоту комнаты. Подсчитать, сколько краски уйдет на покраску стен этой комнаты,
    если на 1м2 стены приходится N литров краски и M% поверхности стен занимают окна и двери.
    Также, рассчитать общую стоимость краски, с учётом того, что один литр краски стоит R гривен.
     */
    static void task1(float n, float m, float r){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of room: ");
        float length = input.nextFloat();
        System.out.println("Enter width of room: ");
        float width = input.nextFloat();
        System.out.println("Enter height of room: ");
        float height = input.nextFloat();

        if( length>0 && height>0 && width>0){
            float p = (length+width)*2;
            float s = p*height;
            float res = (100 - m )/100* s * n;
            System.out.println("We need: " + res + " of color\n The sum: " + r* res + " uan");
        }
        else
            System.out.println("The value can be positive ");

    }

    //Написать программу, которая сможет вычислить сколько товара ценой Y можно купить на Х гривен и сколько получить сдачи
    static void task2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of the item ");
        int y = input.nextInt();
        System.out.println("Enter how much money you have ");
        int x = input.nextInt();

        System.out.println("You can buy: "+ Math.abs(x/y) +" items and your change is " + Math.abs(x%y));


    }

}

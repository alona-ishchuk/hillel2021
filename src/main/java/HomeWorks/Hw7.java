package HomeWorks;

import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args){

task1_2();
    }

    // Определить, параллельна ли прямая оси ординат либо оси абсцисс

    public static void task1_1(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter coordinates of point A \n x: ");
        int x1 = inp.nextInt();
        System.out.println("y: ");
        int y1 = inp.nextInt();
        System.out.println("Enter coordinates of point B \n x:  ");
        int x2 = inp.nextInt();
        System.out.println("y: ");
        int y2 = inp.nextInt();

        System.out.println((x1 == x2) ? "Line parallel the y-axis" : (y1 == y2) ? "Line parallel the x-axis" : "Non parralel x-axis or y-axis");
    }

    /*Программа подсчета идеального веса к росту.
    Ввести рост и вес, вывести сообщение о том, сколько кг набрать или сбросить (идеальный вес = рост - 110)
     */

    public static void task1_2(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your height ");
        int height = inp.nextInt();
        System.out.println("Enter your weight ");
        double weight = inp.nextDouble();
        int ideal = height - 110;
        String answer = ideal < weight? String.format("lose %.3f",(weight - ideal))
                :String.format("gain %.3f", (ideal - weight));

        System.out.format("Your ideal weigh is %d kg, you need %s kg",ideal, answer);
    }

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class less3 {

    public static void main(String[] args){


        double a = 23.6794369;
        DecimalFormat df = new DecimalFormat("###.###");
        a = Float.parseFloat(df.format(a));
        System.out.println(a);


        /*Scanner input = new Scanner(System.in);
        float number = input.nextFloat();


        if(number >0){
            if(number >1 && number <1000000){
                System.out.println("positive");
                //if()
            }
        }*/
    }
}

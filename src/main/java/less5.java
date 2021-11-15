import java.util.Random;
import java.util.Scanner;

public class less5 {

    public static void main(String[] args){
        //task1
        //int rand = (int)(Math.random() * 100 +1);
        //int num  = scan();
        //guess(num, rand);

        task4();

    }

    public static int scan(){
        System.out.println("Enter number ");
        Scanner inp = new Scanner(System.in);
        int myNum = inp.nextInt();

        return myNum;

    }

    public static void guess(int a, int rand){
        if(a == rand){
            System.out.println("You are right, number is " + rand);
        }
        else{

            if(a > rand){
                System.out.println("the value is less ");
                a = scan();
                guess(a, rand);
            }
            else{
                System.out.println("the value is biggest ");
                a = scan();
                guess(a, rand);
            }
        }

    }



    public static void task3() {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number < 1000");
        String num = inp.nextLine();
        boolean isContinium = true;

        for(int i = 0; i < num.length()-1; i++){
            if (isContinium && num.charAt(i) == num.charAt(i+1)){
                System.out.println(" equals");
                isContinium = false;
            }
        }

        if(isContinium) {
            System.out.println("not equals");
        }

    }

    public static void task4(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Cost");
        double cost = inp.nextDouble();
        System.out.println("Enter count");
        int count = inp.nextInt();

        double sum = cost * count;
        int sale = 0;

        if(sum >99 && sum <200){
            sale = 3;
        }
        if(sum > 199 && sum <299){
            sale = 5;
        }
        if(sum >299){
            sale =7;
        }

        switch(sale){
            case 3:
                System.out.println("Your sale is 3%: "+ sum * sale /100);
                break;
            case 5:
                System.out.println("Your sale is 5%: "+ sum * sale /100);
                break;
            case 7:
                System.out.println("Your sale is 7%: "+ sum * sale /100);
                break;
            default:
                System.out.println("The sum isn't enough");
                break;
        }




    }
}

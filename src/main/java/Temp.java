import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        //task5();
        //System.out.println(task5());

    }

    /*    Написать программу перевода денежной суммы из гривен в евро, доллары или российские рубли.
    Решить с использованием if и switch.
     */

    public static void task1(){

        double eur = 30.87;
        double usd = 26.61;
        double rub = 0.364;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Amount in the UAN");
        int amount = inp.nextInt();
        System.out.println(" Select currency To: \n 1.Euro \n 2.USD \n 3.RUB ");
        int currency = inp.nextInt();
        String res;
        double sum = 0;

        switch (currency){
            case 1:
                sum = amount/eur;
                res = " Euro";
                break;
            case 2:
                sum = amount/usd;
                res = " USD";
                break;
            case 3:
                sum = amount/rub;
                res =  " RUB";
                break;
            default:
                res = "Undefined currency";
        }

        System.out.println(res.length() < 10? sum + res: res);

    }


    //Ввести дату и время (каждая компонента вводится отдельно) и проверить корректность введённых значений.
    public static void task2(){
        Boolean trueDay = true;
        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter day 1-31");
        int day = inp.nextInt();
        System.out.println("Enter month 1 - 12");
        int month = inp.nextInt();
        System.out.println("Enter year");
        int year = inp.nextInt();
        StringBuilder builder = new StringBuilder();

        System.out.println(" Enter time : \n Enter Hour 1 - 24");
        int hour = inp.nextInt();
        System.out.println(" Enter minutes 1-59");
        int min = inp.nextInt();

        if(year < 1){
            builder.append("\n wrong year ");
            builder.append(year);

        }

        if(month < 1 || month > 12){
            builder.append("\n wrong month: ");
            builder.append(month);
        }

        if (month == 2 && year%4 != 0 && day > 28){
            builder.append("\n wrong day: ");
            builder.append(day);
            trueDay = false;
        }

        if(trueDay) {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day > 31 || day < 1) {
                        builder.append("\n wrong day: ");
                        builder.append(day);
                        //trueDay = false;
                    }
                    break;
                default:
                    if (day > 30) {
                        builder.append("\n wrong day: ");
                        builder.append(day);
                        //trueDay = true;
                    }

            }
        }

        if (hour < 1 || hour > 24){
            builder.append("\n wrong hour: ").append(hour);

        }

        if (min < 0|| min > 59){
            builder.append("\n wrong min: ").append(min);
        }

        if(builder.length() > 1){
            System.out.println(builder.toString());
        }
        else{
            System.out.println(day+"."+month+"."+year+" "+hour+":"+min+" is correct");
        }


    }


    //Ввести возраст человека и определить пора ли ему на пенсию.

    public static void task3(){
        System.out.println("Enter your age ");
        Scanner inp = new Scanner(System.in);
        int age = inp.nextInt();
        System.out.println(age > 59? "пора на пенсию": "You need continue work");



    }

    //Ввести порядковый номер карты (от 0 до 35) и определить масть и достоинство карты.

    public static void task4(){
        System.out.println("number of card 0-35");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int symbol = num%4;
        int rank = num/4;
        StringBuilder rankStr = new StringBuilder();

        if (num < 0 || num > 35){
            rankStr.append("The value isn't correct");
        }
        else {

            System.out.println(" The number of card is " + num + " than means: ");
            switch (rank) {
                case 0:
                    rankStr.append("6 ");
                    break;
                case 1:
                    rankStr.append("7 ");
                    break;
                case 2:
                    rankStr.append("8 ");
                    break;
                case 3:
                    rankStr.append("9 ");
                    break;
                case 4:
                    rankStr.append("10 ");
                    break;
                case 5:
                    rankStr.append("Jack ");
                    break;
                case 6:
                    rankStr.append("Queen ");
                    break;
                case 7:
                    rankStr.append("King ");
                    break;
                case 8:
                    rankStr.append("Ace ");
                    break;

            }
            switch (symbol){
                case 0:
                    //heart
                    rankStr.append((char)'\u2764');
                    break;
                case 1:
                    //diamond
                    rankStr.append((char)'\u2666');
                    break;
                case 2:
                    //club
                    rankStr.append((char)'\u2663');
                    break;
                case 3:
                    //spade
                    rankStr.append((char)'\u2660');
                    break;
            }

        }
        System.out.println(rankStr.toString());

    }
    public static String task5(){
        System.out.println("Enter hour 1-24");
        Scanner inp = new Scanner(System.in);
        int hour = inp.nextInt();
        System.out.println("Enter minutes 0-59");
        int min = inp.nextInt();
        //String res;

        if(hour > 24 || hour < 1 || min < 0 || min > 59){
            return "Wrong time";
        }
        if(  hour > 22 || hour < 5){
            return "Good night!";
        }
        if( hour > 5 && hour < 12){
            return "Good morning!";
        }
        if(hour >12 && hour < 16){
            return "Good day!";
        }
        return "Good evening!";
    }

}

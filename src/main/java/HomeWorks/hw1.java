package HomeWorks;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class hw1 {

    public static void main(String[] args) {
        int task1_indent = 5;
        //hw1_1(task1_indent);
        hw1_5();
    }

    public static void hw1_1(int start){
        for(int i= 0; i<start; i++){
            System.out.print(" ");
        }
        System.out.print("\"To be\n");

        for(int i = 0; i <start + " To be ".length(); i++){
            System.out.print(" ");
        }
        System.out.print("or not\n");

        for(int i = 0; i <start + " To be or not ".length(); i++){
            System.out.print(" ");
        }
        System.out.print("to be...\"\n");

        for(int i = 0; i < start + " To be or not to be... ".length(); i++){
            System.out.print(" ");
        }
        System.out.print("/ Shakespeare /");
    }

    public static void hw1_2(){
        for (int i = 0; i < 5; i++){
            for(int j = 0; j< i*8; j++) {
                System.out.print(" ");
            }
                System.out.print("I love Java!\n");
            }

        }

    public static void hw1_3(){

        System.out.println("'\\t', '\\n', '\\\\', '\\'', '\\\"'.");
    }

    public static void hw1_4(){
        System.out.println("public static void hw1_3(){\n System.out.println(\"'\\\\t', '\\\\n', '\\\\\\\\', '\\\\'', '\\\\\\\"'.\");\n}");
    }

    public static void hw1_5(){


                String week = "Пн  Вт  Ср  Чт  Пт  Сб  Вс";
                // Получаем текущую дату
                LocalDate now = LocalDate.now();
                // Получаем текущий месяц
                int nowMonth = now.getMonthValue();
                // Узнаем, какой сегодня день
                int nowDay = now.getDayOfMonth();
                // Получаем текущий год
                int nowYear = now.getYear();
                // Определяем дату начала месяца
                LocalDate startMonth = now.minusDays(nowDay -1);
                //берем первый день месяца
                int day = startMonth.getDayOfMonth();
                //просто инициализируем переменную для пределения следующего месяца
                LocalDate nextMonthDate = now;

                //получаем дату что бы вывести месяц буквами
                Date date = new Date();
                //присваиваем строке месяц
                String month = new SimpleDateFormat("MMMM").format(date);
                //выводим в цикле пробелы перед названием месяца
                for(int i = 0; i < week.length()/3; i++){
                    System.out.print(" ");
                }

                //выводим название месяца и дни недели
                System.out.println(month + "\n" + week);


                //провеока если месяц февраль
                if(nowMonth == 2){
                    //тернарная операция на определение высокосного года
                    nextMonthDate = nowYear%4 == 0? startMonth.plusDays(29): startMonth.plusDays(28);
                }
                else{
                    //ищем следующий месяц
                    nextMonthDate = startMonth.plusDays(30);
                }

                //Пробуем получить следующий месяц

                int nextMonth = nextMonthDate.getMonthValue();

                //проверка следующий ли это месяц, отдельнпя проверка для декабря

                if (nextMonth != nowMonth+1){
                    nextMonthDate = nextMonthDate.plusDays(1);
                    nextMonth = nextMonthDate.getMonthValue();
                }

                //Берем последний день текущего месяца
                int endDay = nextMonthDate.minusDays(1).getDayOfMonth();

                //берем день недели с которого начинается месяц
                int dayOfWeek = startMonth.getDayOfWeek().getValue();

                //в цикле выводим первую строку(неделю) календаря
                for(int i = 1; i <=7; i++){
                    //если в дни недели месяц еще не начался - заполняем пробелами
                    if(i < dayOfWeek){
                        System.out.print("    ");

                    }
                    //как только начинается месяц - заполняем числами
                    else{
                        System.out.print(" " + day+ "  ");
                        day++;

                    }
                }

                //цикл для заролнения остальных недель
                for(int i = 0; day<=endDay;  i++){
                    System.out.println();
                    for(int j = 0; j <7 && day<= endDay; j++, day++){
                        //определяем что число с одной цифрой
                        if(day/10 == 0){
                            System.out.print(" " + day+ "  ");
                        }
                        else{
                            System.out.print( day+ "  ");
                        }
                    }

                }

            }

    public static void hw1_6(){
        System.out.println(  "                           *****\n"
                            +"                       ****** *****       *****\n"
                            +"                    *****        *****    *   *\n"
                            +"                 *****              ***** *   *\n"
                            +"             ******                   *****   **\n"
                            +"         ******                               *****\n"
                            +"      *****                                      *****\n"
                            +"  ********************************************************\n"
                            +" ***  *                                              *  ***\n"
                            +"      *                                              *\n"
                            +"      *         ***********         *********        *\n"
                            +"      *         *    *    *         *       *        *\n"
                            +"      *         ***********         *       *        *       **  **  **  **  **  **  **  **  **  **\n"
                            +"      *         *    *    *         *       *        *       **  **  **  **  **  **  **  **  **  **\n"
                            +"      *         ***********         *       *        *       ****************************************\n"
                            +"      *                             *       *        *       **  **  **  **  **  **  **  **  **  **\n"
                            +"      *                             *       *        *       **  **  **  **  **  **  **  **  **  **\n"
                            +"      *                             *       *        *       ****************************************\n"
                            +"      ************************************************       **  **  **  **  **  **  **  **  **  **\n");


    }

    public static void hw1_7(){

        System.out.println(  "                  Ishchuk Alona\n"
                            +"                         *\n"
                            +"                         *\n"
                            +"                         *\n"
                            +"                       *   *\n"
                            +"                      *     *\n"
                            +"        Ishchuk Inna           Ishchuk Oleg\n"
                            +"               *                      *\n"
                            +"               *                      *\n"
                            +"               *                      *\n"
                            +"             *   *                  *   *\n"
                            +"            *     *                *     *\n"
                            +"  Tkachenko      Tkachenko       Ded      Babushka   \n"
                            +"  Valentina      Anatoliy      Feoktist     Luba  \n");

    }

    public static void hw1_8(){
        System.out.println(  "          ****         ****      ********    ***     ***       ****\n"
                            +"       ****  ****    ***  ***    ***         ***     ***    ****  ****\n"
                            +"      ************  ***    ***   ********    ***********   ************\n"
                            +"      ****    ****  ***    ***   ***         ***     ***   ****    ****\n"
                            +"      ****    ****  ***    ***   ********    ***     ***   ****    ****");

    }




    }


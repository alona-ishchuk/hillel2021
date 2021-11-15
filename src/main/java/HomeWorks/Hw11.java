package HomeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class Hw11 {
    public static void main(String[] args){
        //task10();

    }


    public static int[] createArray(int size, int coef1, int coef2){
        int[] numArr = new int[size];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * coef1 - coef2);
        }
        return numArr;
    }

    public static int[] createArray(int size, int coef1){
        int[] numArr = new int[size];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * coef1);
        }
        return numArr;
    }

    public static void printArr(int[] arr){
        /*for (int j : arr) {
            System.out.print(j + ", ");
        }

         */
        System.out.println(Arrays.toString(arr));
    }



  //1.Даны 2 массива размерности M и N соответственно. Необходимо переписать в третий массив
    // общие элементы первых двух массивов без повторений.
  public static void task1(){
      int sizeM = 10;
      int totalRandM = 15;
      int sizeN = 5;
      int totalRandN = 15;
      int resSize = 0;
      boolean isSame = false;
      int[] myArrM = createArray(sizeM, totalRandM);
      int[] myArrN = createArray(sizeN, totalRandN);
      int[] interimArr = new int[Math.min(sizeM, sizeN)];

      System.out.println("Array M: ");
      printArr(myArrM);
      System.out.println("Array N: ");
      printArr(myArrN);

      Arrays.sort(myArrM);
      Arrays.sort(myArrN);
      //System.out.println("sort arr");
      //printArr(myArrM);
      //printArr(myArrN);
      for(int i = 0, k = 0; i < myArrM.length && k < interimArr.length; i++){
          isSame = false;

          for (int j = 0; j < myArrN.length; j++){

              if(!isSame && myArrM[i] == myArrN[j]){
                  isSame = true;
                  //System.out.println("elem M: " + myArrM[i]);
              }
          }
          //System.out.println("boolean is "+ isSame);
          if ( (i > 0 && isSame && myArrM[i - 1] != myArrM[i]) || (i == 0 && isSame) ){
              interimArr[k] = myArrM[i];
              k++;
              resSize++;
          }
      }

      int[] resArr = new int[resSize];
      for (int i = 0; i < resSize; i++){
          resArr[i] = interimArr[i];
      }
      System.out.println("The common elements: ");
      printArr(resArr);

  }

   //2.Даны 2 массива размерности M и N соответственно. Необходимо переписать в третий массив те элементы
    // первого массива, которых нет во втором массиве, без повторений.
   public static void task2(){
       int sizeM = 10;
       int totalRandM = 15;
       int sizeN = 5;
       int totalRandN = 10;
       int resSize = 0;
       boolean isSame = false;
       int[] myArrM = createArray(sizeM, totalRandM);
       int[] myArrN = createArray(sizeN, totalRandN);
       int[] interimArr = new int[sizeM];

       System.out.println("Array M: ");
       printArr(myArrM);
       System.out.println("Array N: ");
       printArr(myArrN);

       Arrays.sort(myArrM);
       Arrays.sort(myArrN);

       for(int i = 0, k = 0; i < myArrM.length && k < interimArr.length; i++){
           isSame = false;

           for (int j = 0; j < myArrN.length; j++){

               if(!isSame && myArrM[i] == myArrN[j]){
                   isSame = true;
               }
           }
           if ( (i > 0 && !isSame && myArrM[i - 1] != myArrM[i]) || (i == 0 && !isSame) ){
               interimArr[k] = myArrM[i];
               k++;
               resSize++;
           }
       }

       int[] resArr = new int[resSize];
       if (resSize >= 0) System.arraycopy(interimArr, 0, resArr, 0, resSize);
       System.out.println("The aren't common elements: ");
       printArr(resArr);

   }


    //3.Создать массив из 20 случайных чисел в диапазоне от -10 до 20. Определить максимальное количество подряд идущих
    // положительных элементов, не прерываемых ни нулями, ни отрицательными числами. Вывести найденный фрагмент.
    public static void task3(){
        int size = 20;
        int totalRand = 31;
        int negativeRand = 11;
        boolean isPositive = false;
        int count = 0;
        int max = 0;
        //int start = 0;
        int end = 0;
        int[] myArr = createArray(size, totalRand, negativeRand);
                //{-6, 19, -8, 19, 11, 13, -4, -9, 3, -3, -9, -5, 0, 11, -1, 0, 8, 2, 3, 1};
                //createArray(size, totalRand, negativeRand);
        printArr(myArr);

        for( int i = 0; i < myArr.length; i++){
            if(myArr[i] > 0 ){
                count++;
                if(i == myArr.length - 1 && count > max){
                    max = count;
                    end = i + 1;
                }
            }
            else{
                if(count > max){
                    max = count;
                    end = i;
                }
                count = 0;
            }

            if(i == myArr.length - 1 && end == 0 && myArr[i] > 0){
                end = i;
            }
        }
        System.out.println("The array is: ");
        for (int i = end - max; i < end; i++){
            System.out.print(myArr[i]+ ", ");
        }

    }

    //4.  Создать массив из 10 случайных чисел в диапазоне от -20 до 20.
    // Преобразовать массив так, чтобы сначала шли все отрицательные элементы, а затем положительные
    // (0 считать положительным).
    public static void task4(){
        int size = 10;
        int totalRand = 42;
        int negativeRand = 21;
        int[] myArr = createArray(size, totalRand, negativeRand);
        Arrays.sort(myArr);
        printArr(myArr);

    }

    //5.Создать массив из 10 целых чисел. Сжать массив, удалив из него все 0, и заполнить освободившиеся справа элементы значениями -1.

    public static void task5(){
        int size = 10;
        int totalRand = 11;
        int neg = 1;
        int count = 0;
        int[] myArr = createArray(size, totalRand, neg);
        int[] resArr = new int[size];
        System.out.println(" The original array : ");
        printArr(myArr);
        for (int i : myArr) {
            if (i != 0) {
                resArr[count++] = i;
            }
        }
        for(; count < resArr.length; count++){
            resArr[count] = -1;
        }
        System.out.println("The result array: ");
        printArr(resArr);

    }


    //6.Создать массив из 10 случайных чисел в диапазоне от -20 до 20. Заменить все отрицательные значения их модулями.
    public static void task6(){
        int size = 10;
        int totalRand = 41;
        int negativeRand = 21;
        int[] myArr = createArray(size, totalRand, negativeRand);
        System.out.println("The input array: ");
        printArr(myArr);

        for(int i = 0; i < myArr.length; i++){
            if( myArr[i] < 0){
               myArr[i] = Math.abs(myArr[i]);
            }
        }
        System.out.println("Output array: ");
        printArr(myArr);

    }

    //7. Создать массив из 10 вещественных чисел. Преобразовать массив так, чтобы сначала шли все элементы с вещественной частью,
    // а потом без нее.
    public static void task7(){

        int size = 10;
        double[] inputArr= {34.000, 54.6784, 9.830756, 123.4582, 69.1221, 67.099869, 67.0000, 111.0000, 12.12121, 777.00000};
        System.out.println("The input array is: \n"+ Arrays.toString(inputArr));
        double[] resArr = new double[size];
        int count = 0;
        double remainderR;
        System.out.println("The array: ");
        for (int i = 0; i < inputArr.length; i++) {
            int withoutFraction = (int) (inputArr[i]);
            remainderR = inputArr[i] - withoutFraction;
            if (remainderR != 0) {
                resArr[count++] = inputArr[i];
            }
        }

        for (int i = 0; i < inputArr.length && count < resArr.length; i++) {
            int withoutFraction = (int) (inputArr[i]);
            remainderR = inputArr[i] - withoutFraction;
            if (remainderR == 0) {
                resArr[count++] = inputArr[i];
            }
        }
        System.out.println("The result array is: ");
        System.out.println(Arrays.toString(resArr));

    }



//8.  Дан массив из 10 элементов типа char. Замените в нем все цифры на большие буквы
// (например, ‘0’ заменяется на ‘А’, ‘1’ заменяется на ‘ B’ и т.д.).
            public static void task8(){

                char[] inputArr = {'7','.', '5', '8', ')', '!', '0', '3', 'w', '9'};
                System.out.println("The  input array is: " + Arrays.toString(inputArr));
                for (int i = 0; i < inputArr.length; i++) {
                    switch (inputArr[i]) {
                        case '0': inputArr[i] = 'A';
                            break;
                        case '1': inputArr[i] = 'B';
                            break;
                        case '2': inputArr[i] = 'C';
                            break;
                        case '3': inputArr[i] = 'D';
                            break;
                        case '4': inputArr[i] = 'E';
                            break;
                        case '5': inputArr[i] = 'F';
                            break;
                        case '6': inputArr[i] = 'G';
                            break;
                        case '7': inputArr[i] = 'H';
                            break;
                        case '8': inputArr[i] = 'I';
                            break;
                        case '9': inputArr[i] = 'J';
                            break;
                    }
                }
                System.out.println("The result array is: " +Arrays.toString(inputArr));

            }

 // 9.Создать массив из 10 целых случайных чисел в диапазоне от 0 до 100. Найти элемент, максимально близкий
    // к среднему арифметическому значений массива.
         public static void task9(){

             int size = 10;
             int totalRand = 101;
             int negativeRand = 1;
             int[] myArr = createArray(size, totalRand, negativeRand);
             System.out.println("The input array is: ");
             printArr(myArr);
             int summ = 0;
             int middle = 0;
             for(int i : myArr) {
                 summ += i;

             }

             middle = summ/myArr.length;
             System.out.println("Сумма всех элементов массива: " + summ + "\nсреднее арифметическое значение массива: " + middle);

             int similar = 0;
             for(int i=0; i < myArr.length; i++){
                 if(((myArr[i] > similar && myArr[i] <= middle) || (myArr[i] < similar && myArr[i] >= middle))
                         && Math.abs(middle-myArr[i]) < Math.abs(middle-similar)
                 ){
                     similar = myArr[i];
                 }
             }
             System.out.println("элемент, максимально близкий к среднему арифметическому значений массива: " + similar);

         }

 // 10. Осуществить циклический сдвиг массива на N элементов. Направление сдвига указывает пользователь
    // (например, массив 0,1,2,3,4,5,6,7,8,9 при циклическом сдвиге вправо на 3 элемента примет вид 7,8,9,0,1,2,3,4,5,6).
         public static void task10(){

             Scanner input = new Scanner(System.in);
             System.out.println("Enter your number: ");
             int numb = input.nextInt();
             int size = 10;
             int totalRand = 11;
             int count = 0;
             int[] myArr = createArray(size, totalRand);
             System.out.println("The input array is: ");
             printArr(myArr);

             int[] res = new int[size];
             for (int i = 0, k = size-numb; i < res.length && k < myArr.length; i++) {
                 res[i] = myArr[k];
                 count++;
                 k++;
             }
             for (int i = 0; i< res.length && count < res.length; i++){
                 res [count++] = myArr[i];
             }
             System.out.println("The output array is: ");
             printArr(res);

         }


}

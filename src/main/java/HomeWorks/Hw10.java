package HomeWorks;

import java.util.Arrays;

public class Hw10 {

    public static void main(String[] args){
        task10();

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


   // 1. Создать массив из 20 случайных чисел в диапазоне от -30 до 10. Написать программу,
    // определяющую сумму элементов массива, находящихся в массиве до первого положительного элемента.

    public static void task1(){
        int size = 20;
        int totalRand = 41;
        int negativeRand = 31;
        boolean isPositive = false;
        int sum = 0;
        int[] myArr = createArray(size, totalRand, negativeRand);
        //System.out.println(Arrays.toString(myArr));
        for(int i = 0; i < size; i++){
            if(!isPositive && myArr[i]<0){
                sum+=myArr[i];
            }
            else{
                isPositive =true;
            }
        }
        System.out.println("The sum of negative number is " + sum);

    }



    //2.Создать массив из 20 случайных чисел. Определить минимальный и максимальный элемент массива
    // (вывести значение и порядковый номер).
    public static void task2(){
        int size = 20;
        int totRand = 101;
        int[] myArr = createArray(size, totRand);
        int max = 0;
        int min = myArr[0];
        int posMax = 0;
        int posMin = 0;
        printArr(myArr);

        for (int i = 0; i <myArr.length; i++){
            if(myArr[i] > max){
                max = myArr[i];
                posMax = i;
            }

            if(myArr[i] < min){
                min = myArr[i];
                posMin = i;
            }
        }

        System.out.println("The max element is "+ max + " with position "+ posMax);
        System.out.println("The min element is "+ min + " with position "+ posMin);



    }




    //3.  Ввести массив из 10 вещественных чисел. Определить, сколько элементов массива не имеют дробной части.
    public static void task3(){
        double[] myArr = { 2.678, 7.000, 5.6765, 9.547547, 234.0000, 34.0000, 78.098, 234.987, 123.000, 567.335};
        int count = 0;
        for (double v : myArr) {
            if (v - (int) v == 0) {
                count++;
            }
        }
        System.out.println(count + " элементов массива не имеют дробной части ");

    }

        //4.Создать массив из 20 случайных чисел в диапазоне от 0 до 200.
        // Определить количество одноразрядных, двухразрядных и трёхразрядных чисел в процентном отношении.
        public static void task4(){
        int size = 20;
        int maxRand = 201;
        int[] myArr = createArray(size, maxRand);
        int count1 = 0, count2 = 0, count3 = 0;
        printArr(myArr);
        for(int x: myArr){
            if(x/100 != 0){
                count3++;
            }
            else{
                if(x/10 !=0){
                    count2++;
                }
                else{
                    count1++;
                }
        }

        }

            System.out.println("количество одноразрядных - " + (count1*100/size) +
                    "%, двухразрядных - " + (count2*100/size)
                    + "% и трёхразрядных - " + (count3*100/size) + "% ");

    }

 //5.Создать массив из 20 целых случайных чисел в диапазоне от 0 до 100.
    // Определить и вывести на экран все простые числа из этого массива.
 public static void task5(){
        int size = 20;
        int maxRand = 101;
        int[] myArr = createArray(size,maxRand);
        boolean isSimple = true;
        printArr(myArr);

     System.out.print("Simpler number is ");

        for (int x:myArr){
            isSimple = true;
            for(int i = x; i > 0; i--){
                if ( i != x && i != 1 && x% i == 0 ) {
                    isSimple = false;


                }

                }
            if(isSimple){
                System.out.print(x + " ,");
            }
        }

 }



    //6.Создать массив из 10 целых случайных чисел. Изменить порядок следования элементов массива
    // на противоположный (1-й элемент меняется с 10-м, 2-й элемент с 9-м и т.д.).

    public static void task6(){
        int size = 20;
        int maxRand = 20;
        int[] myArr = createArray(size,maxRand);
        int temp = 0;
        printArr(myArr);
        for(int i = 0; i < myArr.length/2; i++){
            temp = myArr[i];
            myArr[i] = myArr[size-1-i];
            myArr[size-1-i] =temp;
        }
        printArr(myArr);


    }

    //7.Создать массив из 10 целых случайных чисел. Поменять местами соседние элементы массива.
    public static void task7(){
        int size = 10;
        int maxRand = 20;
        int[] myArr = createArray(size,maxRand);
        int temp = 0;
        printArr(myArr);
        for(int i = 0; i < myArr.length; i++){
            temp = myArr[i];
            myArr[i] = myArr[++i];
            myArr[i] =temp;
        }
        printArr(myArr);

    }

//8.Создать два массива A и B из 5 элементов. Создать третий массив C из 10 элементов,
// в который копируются элементы из первого и второго массива поочередно
// (например, С[0]=A[0], c[1]=B[0], C[2]=A[1], C[3]=B[1] и т.д.).
public static void task8(){
    int size = 5;
    int maxRand = 20;
    int[] myArrA = createArray(size,maxRand);
    int[] myArrB = createArray(size,maxRand);
    int[] myArr = new int[myArrA.length+myArrB.length];
    System.out.println("Array A: ");
    printArr(myArrA);
    System.out.println("Array B: ");
    printArr(myArrB);
    for(int i = 0, a = 0, b = 0; i < myArr.length && a < size && b< size; i++){
        myArr[i] = myArrA[a++];
        myArr[++i] =myArrB[b++];
    }
    System.out.println("Array AB: ");
    printArr(myArr);

}

    //9.Написать программу, копирующую один массив в другой следующим образом: сначала копируются последовательно
    // все элементы, большие 0, затем последовательно все элементы, равные 0, а затем последовательно все элементы,
    // меньшие 0.
    public static void task9(){
        int size = 20;
        int maxRand = 41;
        int neg = 20;
        int count = 0;
        int[] myArr = createArray(size,maxRand, neg);
        int[] res = new int[size];
        printArr(myArr);
        for(int i = 0; i < myArr.length && count < res.length; i++){
            if(myArr[i] > 0){
                res[count++] = myArr[i];
            }
        }
        for(int i = 0; i < myArr.length && count < res.length; i++){
            if(myArr[i] == 0){
                res[count++] = myArr[i];
            }
        }for(int i = 0; i < myArr.length && count < res.length; i++){
            if(myArr[i] < 0){
                res[count++] = myArr[i];
            }
        }
        printArr(res);

    }

    //10.Написать программу, копирующую последовательно элементы одного массива размером 10 элементов в 2 массива
    // размером 5 элементов каждый (задача, обратная задаче 8).
    public static void task10(){
        int size = 10;
        int maxRand = 20;
        int[] myArr = createArray(size,maxRand);
        int[] myArrB = new int[size/2];
        int[] myArrA = new int[size/2];

        for(int i = 0, a = 0, b = 0; i < myArr.length && a < size && b< size; i++){
            myArrA[a++] = myArr[i++];
            myArrB[b++] =myArr[i];
        }
        System.out.println("Array AB: ");
        printArr(myArr);
        System.out.println("Array A: ");
        printArr(myArrA);
        System.out.println("Array B: ");
        printArr(myArrB);

    }
}

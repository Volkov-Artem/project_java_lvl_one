import java.sql.SQLOutput;
import java.util.Arrays;

public class Work2Array {

    public static void main(String[] args) {
        int [] array = {15,2,2,5,5,5};
        changeNumber();
        arrayPush();
        multiArray();
        twoDimensionalArray();
        maxAndMin();
        System.out.println(checkBalance(array));
        System.out.println("______________________");


    }

    public static void changeNumber() {
        int[] array = {0, 1, 0, 1, 0, 0, 0, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                array[i] = 1;
            }
            else if (array[i] == 1) {
                array[i] = 0;
            }


        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayPush(){
        int [] array = new int[8];
        int j =0;
        for (int i = 0; i < array.length; i++) {

            array[i] = j;
            j += 3;

        }
        System.out.println(Arrays.toString(array));
    }
    public static void multiArray(){
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6){
                array[i] *=2;
            }

        }
        System.out.println(Arrays.toString(array));
    }
    public static void twoDimensionalArray(){    //заполнение массива по диагонали при помощи вложенных циклов
        int [][] array = new int[9][9];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0, g = array.length-1; j < array.length; j++ , g--) {
                if(i == j|| i==g){
                    array[i][j] = 1;

                }
                System.out.print(array[i][j]+" " );

            }
            System.out.println();
        }


    }
    public static void maxAndMin (){   // находи минимальгый и максимальный элемент массива
        int [] arr = {1,3,4,-5,6,7,5,4,9};
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        for (int i = 0 , j = arr.length-1; i < arr.length; i++, j--) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[j]){
                min = arr[j];
            }
        }
        System.out.println("MAX = "+ max + " MIN = "+ min);

    }
    public static boolean checkBalance (int[] arr) { // находим балансм между двумя половинками массива
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            int b = 0;
            a += arr[i];    // левая
            for (int k = i+1; k < arr.length; k++) {
                b += arr[k]; //правая
            }
            if(a == b){ return true; // если есть баланс
            }
        }
        return false;
    }



}


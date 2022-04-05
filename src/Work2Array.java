import java.util.Arrays;

public class Work2Array {

    public static void main(String[] args) {
        changeNumber();
        arrayPush();
        multiArray();
        twoDimensionalArray();
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
    public static void twoDimensionalArray(){
        int [][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i == j){
                    array[i][j] = 1;

                }
                System.out.print(array[i][j]);

            }
            System.out.println();
        }

       // System.out.println(Arrays.deepToString(array));
    }

}
package ru.geekbrains.lesson3;

import java.util.Arrays;

public class gbTask3 {

    static int[] binaryArray = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0};
    static int[] hundredLengthArray = new int[100];
    static int[] randArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[][] quadroArray = new int[5][5];
    static int[] testArray = {48, 12, 12, 12, 12};

    public static void main(String[] args) {    //checkUp

        //checkTask1
        System.out.println(Arrays.toString(binaryArray));
        invertBinaryArray(binaryArray);
        System.out.println(Arrays.toString(binaryArray) + "\n");

        //checkTask2
        System.out.println(Arrays.toString(hundredLengthArray));
        fillHundredArray(hundredLengthArray);
        System.out.println(Arrays.toString(hundredLengthArray) + "\n");

        //checkTask3
        System.out.println(Arrays.toString(randArray));
        checkMultArrray(randArray);
        System.out.println(Arrays.toString(randArray) + "\n");

        //checkTask4
        for (int i = 0; i < quadroArray.length; i++) {
            System.out.println(Arrays.toString(quadroArray[i]));
        }
        System.out.println();
        fillDiagArray(quadroArray);

        for (int i = 0; i < quadroArray.length; i++) {
            System.out.println(Arrays.toString(quadroArray[i]));
        }
        System.out.println();

        //checkTask5
        System.out.println(Arrays.toString(initialValueArray(4, 9))+"\n");

        //checkTask6
        System.out.println(Arrays.toString(randArray));
        arrayMinMaxElements(randArray);
        System.out.println();

        //checkTask7
        System.out.println(Arrays.toString(testArray));
        System.out.println(checkBalance(testArray));
        System.out.println(Arrays.toString(randArray));
        System.out.println(checkBalance(randArray)+"\n");

        //checkTask8
        System.out.println(Arrays.toString(hundredLengthArray));
        arrayShift(hundredLengthArray, 5);
        System.out.println(Arrays.toString(hundredLengthArray));
    }

    private static int[] invertBinaryArray(int[] binaryArray) {  //Task1

        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = binaryArray[i] == 1 ? 0 : 1;
        }
        return binaryArray;
    }

    private static void fillHundredArray(int[] hundredArray) {     //Task2
        for (int i = 0; i < 100; i++) {
            hundredArray[i] = i + 1;
        }
    }

    private static void checkMultArrray(int[] randArray) {    //Task3
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = randArray[i] < 6 ? randArray[i] * 2 : randArray[i];
        }
    }

    private static void fillDiagArray(int[][] quadroArray) {  //Task4
        for (int i = 0; i < quadroArray.length; i++) {
            for (int j = 0; j < quadroArray[i].length; j++) {
                if (i == j || i == (quadroArray[i].length - j - 1)) {
                    quadroArray[i][j] = 1;
                }
            }
        }
    }

    private static int[] initialValueArray(int len, int initialValue) {   //Task5
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    private static void arrayMinMaxElements(int[] array) {     //*Task6
        Arrays.sort(array);
        System.out.println("min = "+ array[0] + ", max = " + array[array.length - 1] + "\n");
    }

    private static boolean checkBalance(int[] array) {     //**Task7

        int left;
        int right;

        for (int i = 1; i < array.length - 1; i++) {

            left = 0;
            right = 0;

            for (int j = 0; j < i; j++) {
                left = left + array[j];
            }

            for (int j = i; j < array.length; j++) {
                right = right + array[j];
            }

            if (left == right) {
                return true;
            }
        }
        return false;
    }

    private static void arrayShift(int[] array, int n) {    //***Task8

        int swap;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    swap = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = swap;
                }
            }
        } else if (n < 0) {
            for (int i = 0; i < (-1) * n; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    swap = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}


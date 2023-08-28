package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[]  resultArray = new int[0];

        while (i < j) {
            if (array[i] + array[j] == target) {
                resultArray = new int[2];
                resultArray[0] = i;
                resultArray[1] = j;
                break;
            } else if ((array[i] + array[j]) < target) {
                i++;
            } else {
                j--;
            }
        }
        return resultArray;
    }
}
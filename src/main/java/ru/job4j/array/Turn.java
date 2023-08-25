package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int j = 0;
       int[] temp = new int[array.length];
       System.arraycopy(array, 0, temp, 0, array.length);
       for (int i = 0; i < array.length; i++) {
            j++;
            array[i] = temp[temp.length - j];
        }
        return array;
    }
}



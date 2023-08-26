package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {

       int[] temp = new int[array.length];
       for (int i = 0; i < array.length; i++) {
           temp[i] = array[i];
       }
       for (int j = 0; j < array.length; j++) {
            array[j] = temp[temp.length - j - 1];
        }
        return array;
    }
}



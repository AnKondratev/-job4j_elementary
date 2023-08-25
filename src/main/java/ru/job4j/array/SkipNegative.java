package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] arrays : array) {
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i] < 0) {
                   arrays[i] = 0;
                }
            }
        }
        return array;
    }
}
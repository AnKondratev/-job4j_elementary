package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] arrays : array) {
            for (int index : arrays) {
                rsl += index;
            }
        }
        return rsl;
    }

}

package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int k = 1;
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (1 + j) * k;
            }
            k++;
        }
        return table;
    }

}
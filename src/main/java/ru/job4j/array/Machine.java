package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int j = 0;
        int i = 0;
        while ((money - price) > 0) {
            if ((money - price) >= coins[j]) {
                size++;
                money -= coins[j];
                rsl[i] = coins[j];
            } else {
                j++;
                i--;
            }
            i++;
        }
        return Arrays.copyOf(rsl, size);
    }
}
package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int j = 0;
        money -= price;
        while (money > 0) {
            if (money >= coins[j]) {
                money -= coins[j];
                rsl[size++] = coins[j];
            } else {
                j++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
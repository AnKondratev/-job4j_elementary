package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int j = 0;
        for (int i = 0; i < rsl.length; i++) {
            if ((money - price) > 0 && (money - price) >= coins[j]) {
                money -= coins[j];
                size++;
                rsl[i] = coins[j];
            } else if ((money - price) == 0) {
                break;
            } else {
                j++;
                i--;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
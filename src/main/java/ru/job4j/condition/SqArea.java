package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return ((p / (2 * (k + 1))) * k) * (p / (2 * (k + 1)));
    }

    public static void main(String[] args) {
        System.out.println(" p = 4, k = 1, s = 1, real = " + square(4, 1));
    }
}

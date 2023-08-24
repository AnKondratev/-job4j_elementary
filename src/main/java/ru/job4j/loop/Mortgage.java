package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double percentOfAmount;
        while (amount > 0) {
            percentOfAmount = (amount * percent) / 100;
            amount = (amount - salary) + percentOfAmount;
            year++;
        }
        return year;
    }
}

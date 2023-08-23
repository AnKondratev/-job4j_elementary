package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightWoman = 175;
        short heightMan = 160;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 160 is " + man);
        System.out.println("Woman 175 is " + woman);

    }
}

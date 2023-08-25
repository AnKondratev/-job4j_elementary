package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[100500];
        names[0] = "Andy Manson";
        names[1] = "Samuel Porter";
        names[2] = "Alex Goodman";
        names[3] = "Tony Stark";
        float[] prices = new float[40];
        String newline = System.lineSeparator();
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива names равен: " + names.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println(newline + "Вывод names: " + newline + names[0] + newline + names[1] + newline + names[2] + newline + names[3]);

    }
}

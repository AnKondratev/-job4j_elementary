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
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива names равен: " + names.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println("\n" + "Вывод names: " + "\n" + names[0] + "\n" + names[1] + "\n" + names[2] + "\n" + names[3]);
    }
}

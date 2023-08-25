package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 3, 5, 8, 2, 4, 6, 7};
        sort(data);
        for (int el: data) {
            System.out.println(el);
        }
    }
}
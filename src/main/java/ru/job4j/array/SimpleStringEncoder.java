package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result.append(input.charAt(i - 1));
                if (counter > 1) {
                    result.append(counter);
                }
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        result.append(input.charAt(input.length() - 1));
        if (counter > 1) {
            result.append(counter);
        }
        return result.toString();
    }
}








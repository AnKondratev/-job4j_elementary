package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        input += " ";
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result.append(input.charAt(i - 1));
                if (counter != 1) {
                    result.append(counter);
                }
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
/*            Scanner in = new Scanner(System.in);
            String input = in.nextLine();*/
        String input = "hhhwwyuukkhhhhhh ";
        System.out.println(encode(input));

    }

}

package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 2 + i] != post[post.length - 2 + i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
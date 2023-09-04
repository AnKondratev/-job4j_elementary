package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Then5() {
        int first = 5;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To6Then6() {
        int first = 1;
        int second = 6;
        int result = Max.max(first, second);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int first = 3;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To4To6Then6() {
        int first = 3;
        int second = 4;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax12To4To3To3Then12() {
        int first = 12;
        int second = 4;
        int third = 3;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }
}
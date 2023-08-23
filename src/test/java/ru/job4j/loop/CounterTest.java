package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom6To8Then14() {
        int start = 6;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom5To5Then0() {
        int start = 5;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus2To5Then8() {
        int start = -2;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus7To0ThenMinus12() {
        int start = -7;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = -12;
        assertThat(result).isEqualTo(expected);
    }
}
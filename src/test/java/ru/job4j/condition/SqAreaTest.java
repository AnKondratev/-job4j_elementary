package ru.job4j.condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP3K4Square0Point36() {
        int p = 3;
        double k = 4;
        double out = SqArea.square(p, k);
        double expected = 0.36;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP2K3Square0Point18() {
        int p = 2;
        double k = 3;
        double out = SqArea.square(p, k);
        double expected = 0.18;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP1K5Square0Point03() {
        int p = 1;
        double k = 5;
        double out = SqArea.square(p, k);
        double expected = 0.03;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when23to42Then2Point23() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2.23;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when34to12Then2Point82() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 1;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2.82;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when18to56Then4Point47() {
        int x1 = 1;
        int y1 = 8;
        int x2 = 5;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 4.47;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}



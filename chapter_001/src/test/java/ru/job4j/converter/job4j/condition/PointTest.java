package ru.job4j.converter.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance(){
        int x1 = 0;
        int x2 = 300;
        int y1 = 0;
        int y2 = 400;
        double expected = 500.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.1);
    }
}

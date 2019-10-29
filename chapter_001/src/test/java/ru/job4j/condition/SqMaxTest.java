package ru.job4j.condition;

import org.junit.Test;
import job4j.condition.SqMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void findMax() {
        int result = SqMax.max(1, 4, 2, 8);
        assertThat(result, is(8));
    }
}
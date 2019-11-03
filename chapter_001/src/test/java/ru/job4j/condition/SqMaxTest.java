package ru.job4j.condition;

import org.junit.Test;
import job4j.condition.SqMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void first() {
        int result = SqMax.max(16, 4, 2, 8);
        assertThat(result, is(16));
    }
    @Test
    public void second() {
        int result = SqMax.max(16, 20, 2, 8);
        assertThat(result, is(20));
    }
    @Test
    public void third() {
        int result = SqMax.max(16, 20, 25, 8);
        assertThat(result, is(25));
    }
    @Test
    public void forth() {
        int result = SqMax.max(16, 20, 25, 30);
        assertThat(result, is(30));
    }
    @Test
    public void fifth(){
        int result = SqMax.max(5, 3, 20, 19);
        assertThat(result, is(20));
    }
}
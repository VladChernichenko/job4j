package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void testCounter() {
        Counter c = new Counter();
        int result = c.add(2, 10);
        assertThat(result, is(30));
    }
}

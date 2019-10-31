package ru.job4j.loop;

import job4j.loop.Factorial;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void testFactorial(){
        Factorial f = new Factorial();
        int result = f.calc(5);
        assertThat(result, is(120));
    }
    @Test
    public void testOnZero(){
        Factorial f = new Factorial();
        int result = f.calc(0);
        assertThat(result, is(1));
    }
}

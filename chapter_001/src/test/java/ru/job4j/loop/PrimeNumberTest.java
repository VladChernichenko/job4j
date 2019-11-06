package ru.job4j.loop;

import job4j.loop.PrimeNumber;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PrimeNumberTest {
    @Test
    public void testPrimeNumber(){
        PrimeNumber p = new PrimeNumber();
        int result = p.calc(10);
        assertThat(result, is(5));
    }
}
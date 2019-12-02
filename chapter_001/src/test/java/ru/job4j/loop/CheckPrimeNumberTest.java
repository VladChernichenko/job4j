package ru.job4j.loop;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
public class CheckPrimeNumberTest {
    @Test
    public void when31() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(31);
        assertThat(rsl, is(true));
    }

    @Test
    public void when9() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(9);
        assertThat(rsl, is(false));
    }
}

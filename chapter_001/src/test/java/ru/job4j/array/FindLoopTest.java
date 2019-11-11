package ru.job4j.array;
import job4j.array.FindLoop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas5Then10() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 0;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void when404(){
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 6;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void isSorted02(){
        int[] input = new int[] {5, 7, 3};
        int[] result = FindLoop.sort(input);
        int[] expect = new int[] {3, 5, 7};
        assertThat(result, is(expect));
    }
    @Test
    public void isSorted05(){
        int[] input = new int[] {5, 7, 3, 2, 4};
        int[] result = FindLoop.sort(input);
        int[] expect = new int[] {2, 3, 4, 5, 7};
        assertThat(result, is(expect));
    }
}

package ru.michaelilyin;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static ru.michaelilyin.WaitUtils.watch;

public class MainWorkflowSimpleTest {

    @Test
    public void testTrue() {
        watch(() -> 3).truth().run();
        //assertTrue(res);
    }

    @Test
    public void testTrueFail() {
        boolean res = watch(() -> false).truth().run();
        assertFalse(res);
    }

}

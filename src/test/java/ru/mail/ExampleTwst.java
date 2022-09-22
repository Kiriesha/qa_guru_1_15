package ru.mail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTwst {
    @Test
    void exampleTest0() {
        Assertions.assertFalse(2 >= 5);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue(3 >= 2);
    }

    @Test
    void exampleTest2(){
        Assertions.assertFalse(10>=11);
    }
}


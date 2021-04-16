package org.waman;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class HelloWorldTest {

    @Test
    public void testGreetMethod(){
        String message = HelloWorld.greet("waman");
        assertThat(message, is("Hello, waman!"));
    }
}
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    private HelloWorld helloWorld;

    @BeforeEach
    public void setUp() {
        helloWorld = new HelloWorld("Hello World...!");
    }

    @Test
    public void testGetText() {
        assertEquals("Hello World...!", helloWorld.getText());
    }

    @Test
    void testPrint() {
        helloWorld.print();
    }

}